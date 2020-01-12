/* example of hierachichal inheritence */
import java.util.*;
class Shape
{
int s;
void setValue(int side)
{
s=side;
}
}
class Square extends Shape
{
int area()
{
return(s*s);
}
}
class Cube extends Shape
{
int volume()
{
return(s*s*s);
}
}
class indemo2
{
public static void main(String bu[])
{
int side;
Scanner sc=new Scanner(System.in);
System.out.println("Enter side of square");
side=sc.nextInt();
Square sq=new Square();
sq.setValue(side);
int a=sq.area();
System.out.println("Area of Square :"+a);
System.out.println("Enter side of cube :");
side=sc.nextInt();
Cube cu=new Cube();
cu.setValue(side);
int v=cu.volume();
System.out.println("volume of cube :"+v);
}
}
