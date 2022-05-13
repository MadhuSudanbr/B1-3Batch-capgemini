package com.tns.annotations;
class Bike
{
	String name="KTM";

}
class KTM extends Bike
{
	void display()
	{
		System.out.println(super.name);
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KTM k=new KTM();
		k.display();
		@SuppressWarnings("unused")
		Bike b=new Bike();
	}

}
