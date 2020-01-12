interface Drawable
{
public abstract void Draw();
}
class Rectangle implements Drawable
{
public void Draw()
{
System.out.println("I am in Rectangle class");
}
}
class Circle implements Drawable
{
public void Draw()
{
System.out.println("I am in circle class ");
}
}
class interfacedemo3
{
public static void main(String bu[])
{
Drawable id=new Rectangle();
Drawable id2=new Circle();
id.Draw();
id2.Draw();
}
}
