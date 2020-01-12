//WAP of fibonanci sequence upto n terms

import java.util.*;
class P10
{
public static void main(String bu[])
{
int i,n1=0,n2=1,n3,n;
Scanner sc=new Scanner(System.in);
System.out.println("How many terms  you want in series");
n=sc.nextInt();
System.out.print(n1+"\t"+n2+"\t");
for(i=0;i<=n-2;i++)
{
n3=n1+n2;
System.out.print(n3+"\t");
n1=n2;
n2=n3;
}
}
}