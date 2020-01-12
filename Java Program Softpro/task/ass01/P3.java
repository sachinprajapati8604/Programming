//WAP convert given number of days into number of weeks and days...


import java.util.*;
class P3
{
public static void main(String bu[])
{
int day,w,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of Days");
day=sc.nextInt();
{
w=day/7;
d=day-w*7;
}
System.out.println("number of week is="+w);
System.out.println("number of days is="+d);
}
}