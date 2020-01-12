import java.util.*;
import mypack.AreaPack;
class TestAreaPack
{
public static void main(String bu[])
{
Scanner sc=new Scanner(System.in);
int ch=0;
double x,y;
AreaPack pk=new AreaPack();
System.out.println("Press 1 for Square area \n Press 2 for Rectangle area \n press 3 for circle area \n press 4 for cube");

try
{
ch=sc.nextInt();
System.out.println("Welldone ! You are entered successfully");
}
catch(InputMismatchException ex1)
{
System.out.println("Enter integer number only ...try again..");
}
switch(ch)
{
case 1:
System.out.print("Enter side of square");
x=sc.nextDouble();
pk.sq(x);
System.out.println("Area of square : "+pk.sq(x));
break;

case 2:
System.out.print("Enter length and width of rectangle");
x=sc.nextDouble();
y=sc.nextDouble();
pk.rec(x,y);
System.out.println("Area of square : "+pk.rec(x,y));
break;

case 3:
System.out.print("Enter radius of circle");
x=sc.nextDouble();
pk.cir(x);
System.out.println("Area of square : "+pk.cir(x));
break;

case 4:
System.out.print("Enter side of cube");
x=sc.nextDouble();
pk.cube(x);
System.out.println("Area of square : "+pk.cube(x));
break;


default:
{
System.out.println("Invalid choices");
}
}
}
}