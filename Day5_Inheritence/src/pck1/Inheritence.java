package pck1;
class vehicle
{
	void main()
	{
		System.out.println("vehicle types");
	}
}
class car extends vehicle
{
	void display()
	{
		System.out.println("BMW");
	}
}

class bike extends vehicle
{
	void print()
	{
		System.out.println("Bullet");
	}
}
public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj=new car();
		bike obj1=new bike();
		obj.main();
		obj.display();
		obj1.print();
		
	}

}
