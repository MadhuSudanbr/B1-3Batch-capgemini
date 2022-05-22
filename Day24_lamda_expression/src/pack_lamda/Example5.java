package pack_lamda;

interface D
{
	int mul(int a,int b);
}

public class Example5 {

	public static void main(String[] args) 
	{
		//Lambda expression without return statement
		D obj=(int a,int b)->(a*b);
		System.out.println("Multiplication of a and b is "+obj.mul(10,12));

	}

}
