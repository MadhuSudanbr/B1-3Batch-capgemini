package pck1;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class JUnit_testing5 {
	@Test
	   void accept()
	   {
		   System.setProperty("1","Bhoomi");
		   Assumptions.assumeTrue("Bhoomi".equals(System.getProperty("1")));
		   
	   }
}
