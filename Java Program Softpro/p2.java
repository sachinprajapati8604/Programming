import java.util.*;
class Calc
{
public static void main(String bu[])
{
float a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter two number");
a=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Sum="+(a+b));
System.out.println("Sub="+(a-b));
System.out.println("Mul="+(a*b));
System.out.println("Div="+(a/b));
}
}