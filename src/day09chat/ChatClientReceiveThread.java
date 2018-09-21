package day09chat;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatClientReceiveThread extends Thread {
	private BufferedReader bufferedReader;
	public ChatClientReceiveThread( BufferedReader bufferedReader ) {
		this.bufferedReader = bufferedReader;
	}
	
	@Override
	public void run() {
		try {
			while( true ) {
				//ChatClient 프로그램에서 bufferedReader를 닫아버려 오류 발생..... 읽기를 끝낸다.
				String data = bufferedReader.readLine();
				if( data == null ) {
					break;
				}

				System.out.println( data );
			}
		} catch( IOException ex ) {
			ChatClient.log( "error:" + ex );
		}
	}
}