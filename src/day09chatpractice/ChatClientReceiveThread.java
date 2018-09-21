package day09chatpractice;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatClientReceiveThread extends Thread {

	private BufferedReader bufferedReader;
	public ChatClientReceiveThread(BufferedReader bufferedReader) {
		//super();
		this.bufferedReader = bufferedReader;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		try {
			while(true) {
				String data = bufferedReader.readLine();
				if(data == null) {
					break;
				}
				System.out.println(data);
			}
			
		}catch(IOException e) {
			ChatServer.log("error:"+e);
		}
		
	}
	
	
	
}
