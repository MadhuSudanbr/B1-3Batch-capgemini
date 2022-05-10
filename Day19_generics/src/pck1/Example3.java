package pck1;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<>();
		obj.add("Madhu");
		obj.add("Sudhan");
		String res=obj.get(0);
		System.out.println(res);
		
		System.out.println(obj);
		Iterator<String>i=obj.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}

}
