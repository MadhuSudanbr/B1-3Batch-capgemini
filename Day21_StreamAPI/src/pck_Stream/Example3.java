package pck_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,40,50);
        Optional<Integer>o=obj.stream().reduce((a,b)->(a*b));
        if(o.isPresent())
        {
        	System.out.println("Result: "+o.get());
        }
        
        
	}

}