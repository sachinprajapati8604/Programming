//WAP in java to find volume of cuboid using user defined function

import java.util.*;
class P17
{
static int volume(int l,int b,int h)
{
return(l*b*h);
}
public static void main(String bu[])
{
int x,y,z,v;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length,width,height");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
v=volume(x,y,z);
System.out.println("Volume is:"+v);
}
}


