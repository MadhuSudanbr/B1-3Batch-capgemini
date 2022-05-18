package Date_time;

import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		
        for(String s:ZoneId.getAvailableZoneIds())
         {
                  System.out.println(s);
            }
}

	}


