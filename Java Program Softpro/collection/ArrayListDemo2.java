import java.util.*;
class ArrayListDemo2
{
public static void main(String [] bu)
{
ArrayList<Integer> al=new ArrayList<Integer>();     
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);
Iterator itr=al.iterator();      //Iterator is cursor,itr is variable
while (itr.hasNext())
{
System.out.println(itr.next());                                    
}
}
}