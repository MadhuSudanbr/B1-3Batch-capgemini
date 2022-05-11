package pck1;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;

public class JUnit_testing4 {
@BeforeAll
	
    static void display()
     {
    	 System.out.println("hellooo");
     }
	@Tag("Diya")
	@Disabled
	@Test
	 void display1()
     {
    	 System.out.println("hiiii");
     }
}
