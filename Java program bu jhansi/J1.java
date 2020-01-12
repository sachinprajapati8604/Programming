import java.util.*;
class J1
{
public static void main(String bu[])
{
int a,b,c,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter four digit number");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
n=sc.nextInt();
{
a=n/1000;
b=n%10;
c=a+b;
}
{
System.out.println("the addition of first and last digit="+c);
}
}
}