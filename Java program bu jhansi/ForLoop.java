import java.util.*;
class ForLoop
{
	public static void main(String bu[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(i*n));
		}
	}
}
