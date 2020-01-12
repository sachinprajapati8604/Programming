/*find sum and greatest number among two number using function */

import java.util.*;
class P18_1
{
static int add(int x,int y)
{
return(x+y);
}
int greatest(int x,int y)
{
return x>y?x:y;
}
public static void main(String bu[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
P18_1 p=new P18_1();
int s=p.add(a,b);
int g=p.greatest(a,b);
System.out.println("Sum="+s);
System.out.println("Greatest="+g);
}
}
