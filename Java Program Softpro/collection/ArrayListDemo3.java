/*
by two array list ,sort 
merging one to another
*/
import java.util.*;
class ArrayListDemo3
{
public static void main(String []args)
{
ArrayList<String> al1=new ArrayList<String>();
ArrayList<String> al2=new ArrayList<String>();
al1.add("Jitu");
al1.add("Riya");
al1.add("Priya");
al2.add("Sudhakar");
al2.add("Divakar");
al2.add("Prabhakar");
al1.addAll(al2);
Collections.sort(al1);
System.out.println("List of friends");
for(String f:al1)
{
System.out.println(f);
}
}
}