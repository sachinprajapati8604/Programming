//write a program to find volume and surface area of cuboid
import java.util.*;
class P3
{
public static void main(String bu[])
{
int l,b,h,v,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter height ,lenght,width");
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
{
v=l*b*h;
a=2*(l*b+b*h*h*l);
}
System.out.println("Volume of cuboid="+v);
System.out.println("Surface area of cuboid="+a);
}
}