package day09chatpractice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

	private static final int PORT = 9090;

	public static void log(String log) {
		System.out.println("[chat-server]" + log);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = null;
		List<PrintWriter> listPrintWriters = new ArrayList<PrintWriter>();

		try {
			serverSocket = new ServerSocket();

			String hostAddress = "localhost";
			serverSocket.bind(new InetSocketAddress(hostAddress, PORT));
			log("bind" + hostAddress + ":" + PORT);

			while (true) {
				Socket socket = serverSocket.accept();

				Thread thread = new ChatServerProcessThread(socket, listPrintWriters);
				// listPrintWriters 객체�? ?��?�� ?��?��?���? 만들?��?��. 공유?��기위?��
				thread.start();
			}

		} catch (IOException e) {
			log("error:" + e);
		} finally {
			if (serverSocket != null && serverSocket.isClosed() == false) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					log("error:" + e);
				}
			}
		}

	}

}
