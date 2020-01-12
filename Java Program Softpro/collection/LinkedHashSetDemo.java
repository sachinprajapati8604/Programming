import java.util.*;
class LinkedHashSetDemo
{
public static void main(String bu[])
{
LinkedHashSet<String> hs=new LinkedHashSet<String>();
hs.add("Sachin");
hs.add("Vinay");
hs.add("Naman");
hs.add("Shubham");
for(String f:hs)
{

System.out.println(f);
}
}
}