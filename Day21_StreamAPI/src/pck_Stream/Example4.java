package pck_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,40,50);
		List<Integer>obj1=obj.stream().map(i->i*i).collect(Collectors.toList());
       System.out.println(obj1);

	}

}