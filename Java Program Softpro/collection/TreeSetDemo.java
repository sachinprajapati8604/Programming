import java.util.*;
class TreeSetDemo
{
public static void main(String bu[])
{
TreeSet<String> ts=new TreeSet<String>();       //treeset display in ascending order
ts.add("Sachin");
ts.add("Vikas");
ts.add("Mohan");
ts.add("Aman");
ts.add("Java");
ts.add("Python");
ts.add("Sachin");   //duplicate value will not consider .
ts.add("sachin");     //case diifer
ts.add("123456789"); 
ts.add("987456321"); 
ts.add("1234567890"); 
System.out.println("***********List by TreeSet Displaying in acending order***************");
for(String f:ts)
{

System.out.println(f);
}
}
}