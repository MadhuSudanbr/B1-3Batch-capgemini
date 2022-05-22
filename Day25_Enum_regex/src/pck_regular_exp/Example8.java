package pck_regular_exp;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
      String str="Batch \r\n Madhu sudhan--hi--boy";
      String[] res= str.split("--");
      for(String i:res)
      {
    	  System.out.println(i);
      }
	}

}
