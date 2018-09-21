package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;

public class RequestHandler extends Thread {

	private Socket socket = null;

	public RequestHandler(Socket socket) {
		// super();
		this.socket = socket;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		OutputStream os = null;
		
		try { // ���Ͽ� ������ Ŭ���̾�Ʈ�� ���� ������ �����´�. ���� println -> consoleLog �̴�.
			//���� ������ ����
			
			//�������Ͽ� ������ Ŭ���̾�Ʈ�� ������ �˾ƿ��� �κ�....
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("[server] connected from " + inetSocketAddress.getHostName() + ":" + inetSocketAddress.getPort()
					+ "/" + inetSocketAddress.getHostString());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			os = socket.getOutputStream();
			
			//�ݺ��Ͽ� Ŭ�󸮾�Ʈ�� ��û�� ó���ϱ� ����..
			String request = null;
			String line = "";
			while (true) {
				line = br.readLine();
				if (line == null || "".equals(line)) {
					break;
				}
				//ù�ٸ� �о�´�.
				if (request == null) {
					request = line;
				}

			}
			consoleLog(request);

			// ������� �м��Ѵ�.
			// tokens[0] = "GET" (�޼ҵ�)
			// tokens[1] = "/" (URL)
			// tokens[2] = HTTP/1.1(����)
			String[] tokens = request.split(" ");

			if ("GET".equals(tokens[0])) {
				// GET �޼ҵ� ȣ�� �� ���� ó��
				responseStaticResource(os, tokens[1], tokens[2]); // os�� ����. 2���� ������ 1�� URL�� write������ ������.

			} else {
				// POST PUT���� HTTP �޼ҵ� ȣ��� ������ ó��

				response404Error(os, tokens[2]);
			}

		} catch (IOException e) {
			consoleLog("error :" + e);
		} finally {
			try {
				if (br != null)
					br.close();
				if (os != null)
					os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void responseStaticResource(OutputStream os, String url, String protocol) throws IOException {
		if ("/".equals(url)) {
			url = "/index.html";
		}
		//������ ���� �ý��ۿ��� �ش� ������ �д´�....
		java.io.File file = new java.io.File("./webapp"+url);
		if(file.exists() == false) {
			//404���� �߻�
			response404Error(os, protocol);
			return;
		}
		//file�� ���̳ʸ� �迭�� �о� �ɴϴ�.
		byte[] body = Files.readAllBytes(file.toPath());
		String mineType = Files.probeContentType(file.toPath());	//� Ÿ���� �������� �˷���... �α׷� ����
		consoleLog("�ش��������� mineType�� >>"+mineType);
		
		//Ŭ���̾�Ʈ �������� ������ ����
		//1)��� �ۼ�
		os.write((protocol + "200 OK\r\n").getBytes("UTF-8"));
		os.write(("Content Type:"+mineType+"; charset=utf-8\r\n").getBytes("UTF-8"));
		os.write("\r\n".getBytes("UTF-8"));
		//2)�ٵ� �ۼ�
		os.write(body);
		os.flush();
	}

	public void response400Error(OutputStream os, String protocol)throws IOException {
		File file = new File("./webapp/error/400.html");
		byte[] body = Files.readAllBytes(file.toPath());
		
		os.write((protocol+"400 Bad Request\r\n").getBytes("UTF-8"));
		os.write("content-Type:text/html; charset=utf-8\r\n".getBytes("UTF-8"));
		os.write("\r\n".getBytes("UTF-8"));
		os.write(body);
		os.flush();
	}
	
	public void response404Error(OutputStream os, String protocol)throws IOException {
		File file = new File("./webapp/error/404.html");
		byte[] body = Files.readAllBytes(file.toPath());
		
		os.write((protocol+"404 File Not Found\r\n").getBytes("UTF-8"));
		os.write("content-Type:text/html; charset=utf-8\r\n".getBytes("UTF-8"));
		os.write("\r\n".getBytes("UTF-8"));
		os.write(body);
		os.flush();
	}
	public void consoleLog(String message) {
		System.out.println("Server : " + getId() + " " + message);
	}
}
