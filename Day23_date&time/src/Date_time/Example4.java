package Date_time;

import java.time.Clock;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clock c= Clock.systemUTC();
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c);
	}

}
