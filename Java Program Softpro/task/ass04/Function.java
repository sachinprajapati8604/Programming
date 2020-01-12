import java.util.*;
class Function
{
static int area(int r)
{
return(22/7*r*r);
}
public static void main(String bu[])
{
int x,ar,p;
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of circle ");
x=sc.nextInt();
ar=area(x);
p=new Function().per(x);
System.out.println("Area of circle is :"+ar);
System.out.println("Perimeter of circle is :"+p);
}
int per(int r)
{
return(2*22*r/7);
}
}
