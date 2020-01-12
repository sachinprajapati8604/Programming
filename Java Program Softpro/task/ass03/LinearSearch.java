import java.util.*;
class LinearSearch
{
public static void main(String bu[])
{
int []n=new int [10];
int i,ser;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 Numbers");
for(i=0;i<10;i++)
n[i]=sc.nextInt();
System.out.println("Enter a number You want to search");
ser=sc.nextInt();
//for(i=0;i<10;i++)
{
if(ser==n[i])
{
System.out.println("Search number is found");
}

else
{
System.out.println("Search number is not found");
}
}
}
}