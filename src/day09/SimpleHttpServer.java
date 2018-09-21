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

	public static void consoleLog(String message) { // main �޼ҵ忡�� ���� ���� static ǥ���Ѱ���...
		System.out.println("Server : " + Thread.currentThread().getId() + " " + message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;

		try {
			// 1.���������� �����Ѵ�.
			serverSocket = new ServerSocket();
			String localhost = "localhost";
			// 2.���������� ���ε�(Ŭ���̾�Ʈ ���Ӵ��)
			serverSocket.bind(new InetSocketAddress(localhost, SERVER_PORT));
			consoleLog(", bind : " + localhost + " : " + SERVER_PORT);
			// 3.�ݺ��Ͽ� Ŭ���̾�Ʈ ������ ��ٸ���, ���� �� ���ο� ���ϰ� �̸� ó���ϱ� ���� �����带 �����Ѵ�.
			while (true) {
				Socket socket = serverSocket.accept();
				// HTTP ��û�� ó���� �����带 ������ �� �����Ѵ�.
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
