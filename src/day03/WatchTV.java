package day03;

public class WatchTV {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV(7,20,false);
		tv.power(true);
		tv.volume(false);
		tv.status();
		
		tv.volume((false));
		tv.status();
		
		tv.Channel(0);
		tv.status();
		
		tv.Channel(true);
		tv.Channel(true);
		tv.Channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
