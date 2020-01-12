import java.util.*;
import mypack.calci;
class TestCalciPack
{
public static void main(String bu[])
{
int ch;
double a,b;
calci c=new calci();
Scanner sc=new Scanner(System.in);
System.out.println("enter 1 for sum \n enter 2 for sub \n enter 3 for mul \n enter 4 for div");
ch=sc.nextInt();
switch(ch)
System.out.println("Enter two numbers");
a=sc.nextDouble();
b=sc.nextDouble();
{
case 1:
int add=c.sum(a,b);
System.out.println("Addition is :"+add);
break;
default:
System.out.println("Wrong choice");
}
}
}