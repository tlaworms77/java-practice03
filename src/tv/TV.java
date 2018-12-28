package tv;

public class TV {
	private boolean power;
	private int channel; // 0~50 채널 제한 51이되면 다시 0으로 돌아가는 데이터보호구현
	private int volume; // 0~50
	final static int CHANNEL_MAX = 50;
	final static int CHANNEL_MIN = 0;
	final static int VOLUME_MAX = 50;
	final static int VOLUME_MIN = 0;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// getter setter x
	public void power(boolean on) {
		this.power = on;
	}

	//channel Method
	public void channel(int channel) {
		if (channel > CHANNEL_MAX) {
			this.channel = CHANNEL_MIN;
		} else if (channel < CHANNEL_MIN) {
			this.channel = CHANNEL_MAX;
		} else
			this.channel = channel;
	}

	public void channel(boolean up) {
		if(up) {
			channel++;
			if (channel > CHANNEL_MAX)
				channel = CHANNEL_MIN;
		}else {
			channel--;
			if (channel < CHANNEL_MIN)
				channel = CHANNEL_MAX;
		}
	}

	//volume Method
	public void volume(int volume) {
		// TODO Auto-generated method stub
		if (volume > 50) {
			this.volume = 0;
		} else if (volume < 0) {
			this.volume = 50;
		} else
			this.volume = volume;
	}

	public void volume(boolean up) {
		// TODO Auto-generated method stub
		if(up) {
			volume++;
			if (volume > VOLUME_MAX)
				volume = VOLUME_MIN;
		}else {
			volume--;
			if (volume < VOLUME_MIN)
				volume = VOLUME_MAX;
		}
	}
	
	// 현재 상태 화면에 출력
	public void status() {
		System.out.println("TV[power=" + power + ", channel=" + channel + ", volume=" + volume + "]");
	}

}
