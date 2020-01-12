 import java.util.*;
 class Nested1
{
	public static void main(String bu[])
	{
	int age=0;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter your age : ");
age=sc.nextInt();
if(age<18)
{
System.out.println("You are not adult ");
}
else if(age>18&& age<50)
{
	System.out.println("you are adult and Young ");
	
}
else
{
	System.out.println("You are Old ");
}
	}
}