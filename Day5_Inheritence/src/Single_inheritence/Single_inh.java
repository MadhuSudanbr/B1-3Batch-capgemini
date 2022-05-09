package Single_inheritence;
class Parent
{
	void print()
	{
		System.out.println("Hello");
		
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("Hello its child class");
	}
	
}

public class Single_inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
		c.print();
	}

}
