
import java.util.*;
class Myshape
{
    int area(int s)   //area of square
    {
        return(s*s);
    }
    int area(int l,int b) //area of rectangle
    {
        return(l*b);
        
    }
double area(float r)
{
return(22*r*r)/7;
}
    
public static void main(String bu[])
{
    Scanner sc=new Scanner(System.in);
    Myshape ms=new Myshape();
System.out.print("Enter side of square ");
int s=sc.nextInt();
System.out.println("Area of square :"+ms.area(s));
System.out.print("Enter lenghth and width of rectangle :");
int l=sc.nextInt();
int b=sc.nextInt();
System.out.println("Area of rectangle :"+ms.area(l,b));

   System.out.print("Enter radius of circle :");
float r=sc.nextFloat();
System.out.println("Area of circle:"+ms.area(r));
    
}
    
}
