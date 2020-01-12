import java.util.*;
class P6
{
public static void main(String bu[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&b>c)
{
System.out.println("Greatest number is="+a);
}
else if(b>a&&b>c)
{
System.out.println("Greatest number is="+b);
}
else
{
System.out.println("Graetest number is="+c);
}
}
}



