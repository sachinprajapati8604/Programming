//WAP to create sum of digit of any number

import java.util.*;
class Task01
{
public static void main(String bu[])
{
int n,m,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
n=sc.nextInt();
while(n>0)
{
m=n%10;
sum=sum+m;
n=n/10;
}

System.out.println("sum of digit ="+sum);
}
}
