package day08; //¼±»ý´ÔÀÌ Â§ ÄÚµå

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;

		try {
			socket = new Socket();
			scanner = new Scanner(System.in);
			socket.connect(new InetSocketAddress("localhost", 8888));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"),true);

			while (true) {
				System.out.print(">>>");
				String message = scanner.nextLine();
				if ("exit".equals(message)) {
					break;
				}

				pw.println(message);

				String echoMessage = br.readLine();

				if (echoMessage == null) {
					System.out.println("[Client] ¼­¹ö¿Í ¿¬°áÀÌ ²÷°å½À´Ï´Ù.!!");
					break;
				}
				System.out.println("<<" + echoMessage);
			} // END of while

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (socket != null)
					socket.close();
				if (scanner != null)
					scanner.close();
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
