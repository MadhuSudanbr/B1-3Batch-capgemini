package pck_enum;

enum bike
{
	BULLET,KTM,R15;
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bike b=bike.KTM;
switch(b)
{
case BULLET:
	System.out.println("You choose bullet");
	break;
	
case KTM:
	System.out.println("You choose KTM");
	break;
	
case R15:
	System.out.println("You choose R15");
	break;
	
}
	}

}