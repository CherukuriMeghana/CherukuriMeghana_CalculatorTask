package calculator;
import java.util.*;
// each class contains only single responsibility
class Add
{
	public int add(int a,int b)
	{
		return (a+b);
	}
}
class Sub
{
	public int sub(int a,int b)
	{
		return (a-b);
	}
}
class Div
{
	public int div(int a,int b)
	{
		return (a/b);
	}
}
class Mul
{
	public int mul(int a,int b)
	{
		return (a*b);
	}
}
public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch,a,b;
		while(true)
		{
			System.out.println("enter your option\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.exit");
			ch=sc.nextInt();
			if(ch==5)
				break;
			System.out.println("enter a and b values");
			a=sc.nextInt();
			b=sc.nextInt();
			switch(ch)
			{
			case 1:Add ob1=new Add();
					System.out.println(ob1.add(a,b));break;
			case 2:Sub ob2=new Sub();
					System.out.println(ob2.sub(a,b));break;
			case 3:Div ob3=new Div();
					System.out.println(ob3.div(a,b));break;
			case 4:Mul ob4=new Mul();
					System.out.println(ob4.mul(a,b));break;
			default:System.out.println("Invalid Option");break;		
			}
		}
	}
}
