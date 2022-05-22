package pack_lamda;

interface B
{
	String display(String str);
}


public class Example2 {

	public static void main(String[] args)
	{
		//Lambda expression with return statement
	//Lambda Expression with one parameter
		B obj1=(String str)->
		{
			
			return str;
		};
		System.out.println("Lambda Expression with single parameter");
	}

}
