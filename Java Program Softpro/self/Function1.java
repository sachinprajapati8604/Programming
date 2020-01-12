import java.util.*;
class Function1
{
static int area(int l,int b )   //using static function
{
return(l*b);
}
public static void main(String bu[])
{
int x,y,ar;
System.out.println("Enter length and width of rectangle");
x=new Scanner(System.in).nextInt();
y=new Scanner(System.in).nextInt();
{
ar=area(x,y);
System.out.println("Area :"+ar);
}
int ar1;
System.out.println("Enter one side of square");
int z=new Scanner(System.in).nextInt();

Function1 p=new Function1();
ar1=p.area1(z);
{
System.out.println("Area of square :"+ar1);
}
}
int area1(int s)    
{
return(s*s);
}

}