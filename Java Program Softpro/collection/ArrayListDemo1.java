//insertion and traversal of array list
import java.util.*;
class ArrayListDemo1
{
public static void main(String bu[])
{
ArrayList<String> al=new ArrayList<String>();  //Generic creation of array list
al.add("Sachin");
al.add("Shubham");
al.add("Ravi");
al.add("Ajay");
al.add(1,"Ayush");
al.add(3,"Bikram");
al.add(1,"Vikas");

System.out.println("List of my Friends ");
for(String f:al)
{
System.out.println(f);
}
System.out.println("......................................................................................................................... ");
//for sorting ,it will display in acending order         
Collections.sort(al);

System.out.println("List of my Friends in ascending order");
for(String f:al)
{
System.out.println(f);
}
System.out.println("......................................................................................................................... ");
Collections.reverse(al);    //to sort in decending order
System.out.println("List of My friends in decending order");
for(String f:al)
{
System.out.println(f);
}
}
}