//WAP to find sum and average of 10 number using Array 

import java.util.*;
class P11
{
static public void main(String bu[])
{
int i,sum=0;
double avg=0;
int x[] = new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 numbers");
for(i=0;i<10;i++)
{
x[i]=sc.nextInt();
sum=sum+x[i];
avg=sum+x[i]/10;
}
System.out.println("sum of numbers="+sum);
System.out.println("Average of numbers="+avg);
}
}




