package day09;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;

import sun.net.InetAddressCachePolicy;

public class SimpleHttpServer {
	private static final int SERVER_PORT = 8888;

	public static void consoleLog(String message) { // main 메소드에서 쓰기 위해 static 표기한거임...
		System.out.println("Server : " + Thread.currentThread().getId() + " " + message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;

		try {
			// 1.서버소켓을 생성한다.
			serverSocket = new ServerSocket();
			String localhost = "localhost";
			// 2.서버소켓을 바인딩(클라이언트 접속대기)
			serverSocket.bind(new InetSocketAddress(localhost, SERVER_PORT));
			consoleLog(", bind : " + localhost + " : " + SERVER_PORT);
			// 3.반복하여 클라이언트 접속을 기다리며, 접속 시 새로운 소켓과 이를 처리하기 위한 쓰레드를 수행한다.
			while (true) {
				Socket socket = serverSocket.accept();
				// HTTP 요청을 처리할 쓰레드를 생성한 후 실행한다.
				new RequestHandler(socket).start();

			}

		} catch (IOException e) {
			consoleLog("error : " + e.toString());

		} finally {
			try {
				if (serverSocket != null)
					serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
