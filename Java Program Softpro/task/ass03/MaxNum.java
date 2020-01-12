import java.util.*;
class MaxNum
{
public static void main(String bu[])
{
int []n=new int[10];
int i,max,min;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 Numbers");
for(i=0;i<10;i++)
{
n[i]=sc.nextInt();
}
max=n[0];
for(i=0;i<10;i++)
{
if(n[i]>max) 
{
max=n[i];
}
}
System.out.println("Maximum number is ="+max);
min=n[0];
for(i=0;i<10;i++)
{
if(n[i]<min)
{
min=n[i];
}
}
System.out.println("Minimum number is ="+min);
}
}

