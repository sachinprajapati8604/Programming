import java.util.*;
class VectorDemo
{
public static void main(String bu[])
{
    Vector<String> vc=new Vector<String>();
    vc.add("Sachin");
    vc.add("Annesh");
    vc.add("Abhishek");
    vc.add("vikas");
    System.out.println("List of friends");
    
    ListIterator it=vc.listIterator();
    System.out.println("Forward direction");
    while (it.hasNext())
    {
        System.out.println(it.next());
    }
    System.out.println("Backword Direction");
    while (it.hasPrevious())
    {
        System.out.println(it.previous());
    }
}
}