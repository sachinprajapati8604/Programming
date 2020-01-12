//factorial program

import java.util.*;
class P2
{
public static void main(String [] args)
{
int n,i ,f=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("factorial is :" +f);
}
}


