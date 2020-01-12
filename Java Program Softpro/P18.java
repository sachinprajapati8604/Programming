/* find sum and greatest among two number using static and non satic function  */


import java.util.*;
class P18
{
static int add(int x,int y)
{
return(x+y);
}
int greatest(int x,int y)
{
return x>y?x:y;     //ternary operator ? gives if x greater than y print x else y
}
public static void main(String bu[])
{
int a,b,sum,great;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
a=sc.nextInt();
b=sc.nextInt();
sum=add(a,b);
great=new P18().greatest(a,b);
System.out.println("Sum="+sum);
System.out.println("greatest="+great);
}
}

