package pck1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class JUnit_testing3 {
	@Disabled
	void print()
	{
		
		 int a=1;
		 int b=2;
		 assertEquals(a,b);
	}
		 @Test
		 void print1()
		 {
			
			 int a=1;
			 int b=1;
			 assertEquals(a,b);
		 }
	}

