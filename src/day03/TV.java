package day03;

public class TV {

	private int channel;
	private int volume;
	boolean power;	//true or false

	public TV(int channel, int volume, boolean power) {
	//	super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void Channel(int channel) {
		this.channel = channel;
	}


	public void power(boolean b) {
		// TODO Auto-generated method stub
		if(b) {
			System.out.print("TV의 전원을 켰습니다.");
		}else {
			System.out.print("TV의 전원을 껏습니다.");
		}
	}
	public void volume(boolean b) {
		// TODO Auto-generated method stub
		if(b) {
			volume +=1;
		}else {
			volume -=1;
		}
	}
	public void Channel(boolean b) {
		// TODO Auto-generated method stub
		if(b) {
			channel +=1;
		}else {
			channel -=1;
		}
	}
	
	public void status() {
		System.out.println("채널값은 "+channel+"볼륨값은 "+volume);
	}




	
}