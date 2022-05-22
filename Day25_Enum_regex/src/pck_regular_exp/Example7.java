package pck_regular_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Hello");
		Matcher m=p.matcher("Hello World");
      while(m.find())
      {
    	  System.out.printf("Pattern found from : " +m.start() + " to " +(m.end()-1));
      }
      System.out.println("Nothing");
	}


}
