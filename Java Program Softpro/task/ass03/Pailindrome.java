import java.util.*;
class Pailindrome
{
public static void main(String bu[])
{
int temp,rem,rev=0;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(temp==rev)
{
System.out.println("Number is pailindrome");
}
else
{
System.out.println("Number is not pailndrome");
}
}
}
