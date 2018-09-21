package day09chatpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ChatServerProcessThread extends Thread {
	private static final String PROTOCOL_DRIVER = ":";

	private String nickname;
	private Socket socket;
	private List<PrintWriter> listPrintWriters;

	public ChatServerProcessThread(Socket socket, List<PrintWriter> listPrintWriters) {
		// super();
		this.socket = socket;
		this.listPrintWriters = listPrintWriters;
	}

	private void doQuit(PrintWriter printWriter) {
		// removePrintWriter 메서드로 뺄수 있다.
		synchronized (listPrintWriters) {
			listPrintWriters.remove(printWriter);
		}
		String data = nickname + "님이 퇴장하였습니다.";
		// broadcast(data) 매서드로 뺄 수 있다.
		synchronized (listPrintWriters) {
			int count = listPrintWriters.size();
			for (int i = 0; i < count; i++) {
			//	PrintWriter printWriter = listPrintWriters.get(i);
				printWriter = listPrintWriters.get(i);
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}
	
	private void doMessage(String message) {
		String data = nickname+":"+message;
		// broadcast(data) 매서드로 뺄 수 있다.
		synchronized (listPrintWriters) {
			int count = listPrintWriters.size();
			for(int i =0;i<count;i++) {
				PrintWriter printWriter = listPrintWriters.get(i);
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}
	
	private void doJoin(PrintWriter printWriter, String nickname) {
		this.nickname = nickname;
		
		String message = nickname +"님의 입장했습니다.";
		// broadcast(data) 매서드로 뺄 수 있다.
		synchronized (listPrintWriters) {
			int count = listPrintWriters.size();
			for(int i=0;i<count;i++) {
				printWriter = listPrintWriters.get(i);
				printWriter.println(message);
				printWriter.flush();
			}
		}
		///addPrintWriter( printWriter ); 로 바꿀수 있다.
		synchronized (listPrintWriters) {
			listPrintWriters.add(printWriter);
		}
		///
		printWriter.println("join:ok");
		printWriter.flush();
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = null;
		PrintWriter printWriter = null;

		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),
					true);

			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			String remoteHostAddress = inetSocketAddress.getHostName();
			int remoteHostPort = inetSocketAddress.getPort();
			ChatServer.log("연결됨 from" + remoteHostAddress + ":" + remoteHostPort);

			while (true) {
				String request = bufferedReader.readLine();
				if (request == null) {
					ChatServer.log("클라이언트로 부터 연결 끊김");
					doQuit(printWriter);
					break;
				}
				String[] tokens = request.split(PROTOCOL_DRIVER);

				if ("join".equals(tokens[0])) {
					doJoin(printWriter, tokens[1]);
				} else if ("message".equals(tokens[0])) {
					doMessage(tokens[1]);
				} else if ("quit".equals(tokens[0])) {
					doQuit(printWriter);
					break;
				} else {
					ChatServer.log("에러: 알수없는 요청명령(" + tokens[0] + ")");
				}
			}
		} catch (IOException e) {
			ChatServer.log("error:" + e);
		} finally {
			try {
				bufferedReader.close();
				printWriter.close();
				if (socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException e) {
				ChatServer.log("error:" + e);
			}
		}

	}

}
