package day09chatpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_ADDRESS = "localhost";
	private static final int SERVER_PORT = 9090;

	public static void log(String log) {
		System.out.println("[chat-client]" + log);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		Socket socket = null;
		BufferedReader bufferedReader = null;
		PrintWriter printWriter = null;

		try {
			scanner = new Scanner(System.in);

			socket = new Socket();

			socket.connect(new InetSocketAddress(SERVER_ADDRESS, SERVER_PORT));

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),
					true);

			System.out.print("Nickname>>");
			String nickname = scanner.nextLine();
			printWriter.println("join:" + nickname);
			printWriter.flush();
			bufferedReader.readLine();

			Thread thread = new ChatClientReceiveThread(bufferedReader);
			thread.start();

			while (true) {
				System.out.print(">>");
				String input = scanner.nextLine();
				if (input.length() == 0) {
					log("Insert a message");
					continue;
				}

				if ("quit".equals(input) == true) {
					printWriter.println("quit");
					printWriter.flush();
					break;
				} else {
					printWriter.println("message:" + input);
					printWriter.flush();
				}
			}

		} catch (IOException e) {
			log("error:" + e);
		} finally {
			try {
				if (scanner != null) {
					scanner.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (printWriter != null) {
					printWriter.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				log("error:" + e);
			}
		}

	}

}
