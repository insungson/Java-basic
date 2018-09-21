package day08;				//���� § �ڵ�

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;
		OutputStream outputStream = null;
		InputStream inputStream = null;
		Scanner scanner = null;
		
		try {
			socket = new Socket();
			System.out.println("[Ŭ���̾�Ʈ] �����û");
			socket.connect(new InetSocketAddress("localhost", 8888));
			System.out.println("[Ŭ���̾�Ʈ] ���Ἲ��");
			
			outputStream = socket.getOutputStream();
			inputStream = socket.getInputStream();
			while(true) {
				System.out.print(">>>");
				scanner = new Scanner(System.in);
				String host = scanner.nextLine();
				
				outputStream.write(host.getBytes("UTF-8"));
				outputStream.flush();
				if (host.equals("exit"))
					break;
				
				byte[]scbuffer = new byte[128];
				int readByteCount1 = inputStream.read(scbuffer);
				host = new String(scbuffer,0,readByteCount1,"UTF-8");
				if (host.equals("exit")) {
					break;
				}else {
					System.out.println("[�Է�]������ ���� :"+host);		
				}
				
			}
			
			String data = "hello world �Դϴ�.";
			outputStream.write(data.getBytes("UTF-8"));
			outputStream.flush(); //Binds
			
			byte[]buffer = new byte[128];
			int readByteCount = inputStream.read(buffer);

			
			data = new String(buffer,0,readByteCount,"UTF-8");
			//System.out.println("[Ŭ���̾�Ʈ] ������ ���� :"+data);
			System.out.println("[Ŭ���̾�Ʈ] �����");
		}catch(IOException e) {
		e.printStackTrace();	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(socket != null)
					socket.close();	
				if(outputStream != null)
					outputStream.close();
				if(inputStream != null)
					inputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}	
		}
		
	}

}
