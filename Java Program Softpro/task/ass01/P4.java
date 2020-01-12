//WAP of switch case  to conversion of temperature


import java.util.*;
class P4
{
public static void main(String  bu[])
{
int choice,f,c;
Scanner sc=new Scanner(System.in);
System.out.println("select choice: \n Press 1.celcius to fahrenheit \n Press 2.fahrenheit to celcius ");
choice=sc.nextInt();
switch(choice)
{
case 1:
{
System.out.println("Enter temperature in celcius");
}
c=sc.nextInt();
{
f=c*9/5+32;
}
System.out.println("Temperature in fahrenheit is="+f);
break;
case 2:
{
System.out.println("Enter temperature in Fahrenheit");
}
f=sc.nextInt();
{
c=(f-32)*5/9;
}
System.out.println("Temperature in celcius is="+c);
break;
default:
{
System.out.println("Wrong choice");
}
}
}
}