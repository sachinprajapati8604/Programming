import java.util.*;
class P7
{
public static void main(String bu[])
{
int u;
Scanner sc=new Scanner(System.in);
System.out.println("Enter unit of bill ");
u=sc.nextInt();
if(u<150)
{
System.out.println("Your bill is="+(u*2.40));
}
else if(u>150&&u<300)
{
System.out.println("Your bill is="+((150*2.40) +(u-150)*3.00));
}
else
{
System.out.println("Your bill is="+((150*2.40)+(150)*3.00+(u-300)*3.20));
}
}
}