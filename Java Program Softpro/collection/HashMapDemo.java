import java.util.*;
class HashMapDemo
{
public static void main(String bu[])
{
Map<String,String> hm=new HashMap<String,String>();     //1st string is for key 2nd string is for value
hm.put("name","Sachin Prajapati");
hm.put("address","Unnao");
hm.put("Contact Number","8604980059");
for(Map.Entry<String,String> entry:hm.entrySet())
{
System.out.println(entry.getKey() +"="+entry.getValue());
}
}
}