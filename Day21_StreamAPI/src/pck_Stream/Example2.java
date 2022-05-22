package pck_Stream;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,40,50);
        obj.stream().distinct().forEach(System.out::println);
        System.out.println("Distinct output");
        obj.stream().limit(3).forEach(System.out::println);
        System.out.println("Skip output");
        obj.stream().skip(3).forEach(System.out::println);
}
}
