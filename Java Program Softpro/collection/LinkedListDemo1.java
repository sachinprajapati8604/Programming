import java.util.*;
class LinkedListDemo1
{
public static void main(String sp[])
{
LinkedList<String> al=new LinkedList<String>();
al.add("Rajat");
al.add("Shiva");
al.add("Priya");
al.add(0,"Shivam");
al.add(1,"Disha");
Collections.sort(al);
System.out.println("My friend list -----");
for(String f:al)
{
System.out.println(f);
}
}
}