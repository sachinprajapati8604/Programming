// sum of any given number

import java.util.*;
class P1
{
public static void main(String [] args)
{
int n ,sum;
Scanner sc=new Scanner(System.in);
System.out.println("enter any two digit number");
n=sc.nextInt();
sum=n/10+n%10;
System.out.println("sum of digit is="+sum);
}
}