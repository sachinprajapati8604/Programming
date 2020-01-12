import java.util.*;
import mypack.calci;
class TestCalciPack
{
public static void main(String bu[])
{
int ch;
double a,b;
calci c=new calci();    //make object from package class
Scanner sc=new Scanner(System.in);
System.out.println("enter 1 for sum \n enter 2 for sub \n enter 3 for mul \n enter 4 for div");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter two numbers");
a=sc.nextDouble();
b=sc.nextDouble();
double add=c.sum(a,b);
System.out.println("Addition is :"+add);
break;

case 2:
System.out.println("Enter two numbers");
a=sc.nextDouble();
b=sc.nextDouble();
c.sub(a,b);
System.out.println("Substraction is :"+c.sub(a,b));
break;

case 3:
System.out.println("Enter two numbers");
a=sc.nextDouble();
b=sc.nextDouble();
c.mul(a,b);
System.out.println("Multiplication is :"+c.mul(a,b));
break;


default:
System.out.println("Wrong choice");
}
}
}