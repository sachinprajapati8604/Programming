
import java.util.*;
import mypack.TempConv;
class TestPackage
{
public static void main(String bu[])
{
int ch;
double c,f;
TempConv tc=new TempConv();
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for c to f \n Enter 2 for f to c");

ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter temperature in c");
c=sc.nextDouble();
f=tc.ctof(c);
System.out.println("temperature in f is :"+f);
break;
case 2:
System.out.println("Enter temperature in f");
f=sc.nextDouble();
c=tc.ftoc(f);
System.out.println("Temperature in c :"+c);
break;
default:
System.out.println("Wrong choice");
break;
}
}
}