package pck_Stream;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,40,50);
        obj.stream().filter(i->i<70).forEach(i->System.out.println(i));
		
	}

}
