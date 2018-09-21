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
		
		try { // 소켓에 접속한 클라이언트에 대한 정보를 가져온다. 이젠 println -> consoleLog 이다.
			//연결 스프링 생성
			
			//서버소켓에 접속한 클라이언트의 정보를 알아오는 부분....
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("[server] connected from " + inetSocketAddress.getHostName() + ":" + inetSocketAddress.getPort()
					+ "/" + inetSocketAddress.getHostString());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			os = socket.getOutputStream();
			
			//반복하여 클라리언트의 요청을 처리하기 위함..
			String request = null;
			String line = "";
			while (true) {
				line = br.readLine();
				if (line == null || "".equals(line)) {
					break;
				}
				//첫줄만 읽어온다.
				if (request == null) {
					request = line;
				}

			}
			consoleLog(request);

			// 헤더값을 분석한다.
			// tokens[0] = "GET" (메소드)
			// tokens[1] = "/" (URL)
			// tokens[2] = HTTP/1.1(버전)
			String[] tokens = request.split(" ");

			if ("GET".equals(tokens[0])) {
				// GET 메소드 호출 시 정상 처리
				responseStaticResource(os, tokens[1], tokens[2]); // os로 쓴다. 2번의 버젼과 1의 URL을 write값으로 보낸다.

			} else {
				// POST PUT등의 HTTP 메소드 호출시 오류분 처리

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
		//서버의 파일 시스템에서 해당 파일을 읽는다....
		java.io.File file = new java.io.File("./webapp"+url);
		if(file.exists() == false) {
			//404오류 발생
			response404Error(os, protocol);
			return;
		}
		//file을 바이너리 배열로 읽어 옵니다.
		byte[] body = Files.readAllBytes(file.toPath());
		String mineType = Files.probeContentType(file.toPath());	//어떤 타입의 파일인지 알려줌... 로그로 찍어보자
		consoleLog("해당페이지의 mineType은 >>"+mineType);
		
		//클라이언트 브라우저로 데이터 전송
		//1)헤더 작성
		os.write((protocol + "200 OK\r\n").getBytes("UTF-8"));
		os.write(("Content Type:"+mineType+"; charset=utf-8\r\n").getBytes("UTF-8"));
		os.write("\r\n".getBytes("UTF-8"));
		//2)바디 작성
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
