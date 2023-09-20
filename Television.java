package test;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		Television yourTv = new Television();
		yourTv.channel = 14;
		yourTv.volume = 20;
		yourTv.onOff = true;
		
		System.out.println("나의 TV채널은 " + myTv.channel +"이고 볼륨은 "+ myTv.volume +"입니다.");
		System.out.println("당신의 TV채널은 " + yourTv.channel +"이고 볼륨은 "+ yourTv.volume +"입니다.");
		
		
	}

}
