package pack_lamda;

interface A
{
	void show();//functional interface which contains only one abstract method
}

/*class B implements A
{
	public void show()
	{
		System.out.println("Functional Interface");
	}
}*/


public class Example1 {

	public static void main(String[] args) {
		
 A  obj= ()->
 {
	 System.out.println("Functional Interface");
 };
      obj.show();
	}
}
