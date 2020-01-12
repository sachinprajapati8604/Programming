/*
creating two linkedlist ,adding them in first linkedlist
sorting in ascending and decending order by for each loop 


*/
import java.util.*;
class LinkedListDemo3
{
public static void main(String bu[])
{
LinkedList<String> al1=new LinkedList<String>();
LinkedList<String> al2=new LinkedList<String>();
al1.add("Sachin Prajapati");
al1.add("Ashish");
al1.add("Alok");
al1.add("Vikash");
al2.add("Abhishek");
al2.add("Vinod");
al2.add("Surya");
al2.add("Mithun");
al1.addAll(al2);
Collections.sort(al1);
System.out.println("*****List of my Friends in ascending order*****");
for(String f:al1)
{
System.out.println(f);
}
Collections.reverse(al1);
System.out.println("*****List of my friends in decending order*****");
for(String name:al1)
{
System.out.println(name);
}
}
}