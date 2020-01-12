/* example of single inheritence */
class Rundog
{
void bark()
{
System.out.println("Sheru......");
System.out.println("Bho....BHo...");
}
}
class Bulldog extends Rundog     //bulldog hold property of rundog
{
void grawl()
{
System.out.println("Tuffy......");
System.out.println("Gurr......Gurr...");
}
}
class indemo1
{
public static void main(String bu[])
{
Bulldog dog =new Bulldog();    
dog.bark();
dog.grawl();
}
}