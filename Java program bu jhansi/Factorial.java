import java.util.*;
class Factorial
{
	public static void main(String bu[])
	{
		int num,f=1,i;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("factorial is =" +f);
		
	}	
}