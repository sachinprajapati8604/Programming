//WAP in java to take 5 name as input and display name in sorted order 

import java.util.*;
class P12
{
public static void main(String bu[])
{
int i;
String []name =new String[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 Names");
for(i=0;i<name.length;i++)
{
name[i]=sc.nextLine();
}
Arrays.sort(name); //this method sort array elements
System.out.println("Names in sorted order");
for(i=0;i<name.length;i++)
{
System.out.println(name[i]);
}
}
}
