package pck_enum;

public class Example5 
{

	enum empType
	{
		contract,permanent,temporary;
	}
	
	static void print(empType e)
	{
		if(e==empType.permanent)
		{
			System.out.println("Permanent Enployee");
		}
		else if(e==empType.contract)
		{
			System.out.println("Contract Enployee");
		}
		else
		{
			System.out.println("temporary Enployee");
		}
	}
	public static void main(String[] args) 
	{
		empType e=empType.permanent;
		print(e);
	
	}

}
