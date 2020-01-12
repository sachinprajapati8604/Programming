import java.util.*;
class P2
{
	public static void main(String bu[])
	{
		int n,f=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial ="+f);
	}
}
