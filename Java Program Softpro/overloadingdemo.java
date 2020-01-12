/*Method Over Loading is method of compile time of Polymorphism */

class Myshape
{
int area(int s)  //area of rectangle
{
return(s*s);
}
int area(int l,int b)  //area of rectangle
{
return(l*b);
}
double area(float r)   //area of circle
{
return(3.14*r*r);
}
public static void main(String bu[])
{
Myshape ms=new Myshape();
System.out.println("Area of square ="+ms.area(10));
System.out.println("Area of rectangle ="+ms.area(10,5));
System.out.println("Area of circle ="+ms.area(10.5f));
}
}