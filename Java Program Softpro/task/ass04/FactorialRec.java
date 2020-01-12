import java.util.*;
class FactorialRec
{
static int fact(int n)
{
if(n==0)
return 1;
else
return(n*fact(n-1));
}
public static void main(String bu[])
{
int num,f=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
f=fact(num);
System.out.println("Factorial is : " +f);
}
}