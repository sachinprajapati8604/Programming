//WAP of Prime number from 1 to 100

import java.util.*;
class Task02
{
public static void main(String bu[])
{
int i,n=1,count;
System.out.println("Prime numbers are:");
while(n<=100)
{
count=0;
i=2;
while(i<=n/2)
{
if (n% i==0)
{
count++;
break;
}
i++;
}
if(count==0 && n!=1)
{
System.out.print(n +"\t");

}
n++;
}
}
}