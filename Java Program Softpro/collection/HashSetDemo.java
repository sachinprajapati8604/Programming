import java.util.*;
class HashSetDemo
{
public static void main(String bu[])
{
HashSet<Float> hs=new HashSet<Float>();    //hasset store unique value
hs.add(1.5f);
hs.add(2.5f);
hs.add(3.5f);
hs.add(1.5f);     //it will not consider dublicate value
hs.add(3.5f);
for(Float v:hs)
{
System.out.println(v);
}
}
}