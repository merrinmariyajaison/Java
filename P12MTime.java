class Time {
	int hour, minute;

	public Time() {
		hour = 0;
		minute = 0;
	}
	
	public Time(int hour) {
		this.hour = hour;
		minute = 0;
	}

	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public Time sum(Time t) {
		Time a = new Time();
		if (minute + t.minute >= 60) {
			int m = (minute + t.minute) % 60;
			System.out.println(m);
			int h = (minute + t.minute) / 60;
			System.out.println(h);
			a.hour = hour + t.hour + h;
			a.minute = m;
			if (a.hour >= 24)
				a.hour = a.hour % 24;
			return a;
		} 
		else {
			a.hour = hour + t.hour;
			a.minute = minute + t.minute;
			if (a.hour >= 24)
				a.hour = a.hour % 24;
			return a;
		}
	}
}

class MTime {
	public static void main(String[] args) {
		Time t1 = new Time(12);
		Time t2 = new Time(6, 40);
		Time t3 = new Time(20, 40);
		System.out.println("Time t1: " + t1.hour + ":" + t1.minute);
		System.out.println("Time t2: " + t2.hour + ":" + t2.minute);
		System.out.println("Time t3: " + t3.hour + ":" + t3.minute);
		Time s1 = t1.sum(t2);
		System.out.println("Time t1+t2: " + s1.hour + ":" + s1.minute);
		Time s2 = t2.sum(t3);
		System.out.println("Time t2+t3: " + s2.hour + ":" + s2.minute);
	}
}