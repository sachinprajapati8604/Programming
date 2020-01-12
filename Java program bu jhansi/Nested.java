import java.util.*;
class Nested
{
public static void main(String bu[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number : ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && b>c)
{
System.out.println("The greatest number is :  "+a);
}
else if(b>c)
{
System.out.println("The greatest number is : "+b);
}
else
{
System.out.println("The greatest number is : "+c);
}

}
}