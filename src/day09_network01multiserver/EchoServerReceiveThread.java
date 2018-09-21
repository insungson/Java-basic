package day09_network01multiserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class EchoServerReceiveThread extends Thread {

	private Socket socket = null;

	public EchoServerReceiveThread(Socket socket) {
		// super();
		this.socket = socket;
	}

	public void consoleLog(String message) {
		System.out.println("Server : " + getId()+" "+ message);
	}

	@Override
	public void run() {						//앞에서 start를 실행하면 이건 자동으로 실행이 된다.
		// TODO Auto-generated method stub
		InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		consoleLog("[server] connected from " + inetSocketAddress.getHostName() + ":" + inetSocketAddress.getPort()
				+ "/" + inetSocketAddress.getHostString());

		BufferedReader br = null;
		PrintWriter pr = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			pr = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			while (true) {
				String message = br.readLine();
				if (message == null) {
					consoleLog("클라이언트와의 연결이 끊겼습니다.!!");
					break;
				}
				if (message.toUpperCase().equals("QUIT")) {
					consoleLog("클라이언트와의 연결이 끊겼습니다.!!");
					break;
				}
				consoleLog("receive : " + message);
				pr.println(message);

			} // End of While

		} catch (SocketException e) {
			consoleLog("클라이언트와의 연결이 끊겼습니다.!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pr != null)
					pr.close();
				if (br != null)
					br.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
