package pck1;

public class generic_class<T>
	{
		 T val;
		 T val1;
		 void print()
		 {
		      System.out.println(val.getClass());	 
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generic_class<Integer>obj=new generic_class<>();
		generic_class<String>obj1=new generic_class<>();
		obj.val=19;
		obj1.val="Madhu";
		obj.print();
		obj1.print();

}
}