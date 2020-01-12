//exeception demo 

import java.util.*;
class exdemo2
{
public static void main(String bu[])
{
Scanner sc=new Scanner(System.in);
float a,b,c;
System.out.println("enter two number ");
try
{
a=sc.nextFloat();
b=sc.nextFloat();
c=a/b;
System.out.println("Division is :"+c);
}
catch(InputMismatchException ex1)
{
System.out.println("Enter  numbers only");
}
catch(ArithmeticException ex2)
{
System.out.println("Are you trying to divide by zero");
}
}
}
