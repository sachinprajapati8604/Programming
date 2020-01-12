import java.util.*;
class P1
{
	public static void main(String bu[])
	{
	int n,i;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number");	
n=sc.nextInt();
for(i=1;i<=10;i++)
{
	System.out.println(n + "*"+i+ "="+n*i);
}
	}
}