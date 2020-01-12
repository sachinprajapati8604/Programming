/*
equals():-The equals() funtion in String class is used to compare two string for equality..
equalsIgnoreCase():-is used for ignoring the case senstive string
*/

import java.util.*;
class P14
{
public static void main(String bu[])
{
String str1,str2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first string");
str1=sc.nextLine();
System.out.println("Enter Second string");
str2=sc.nextLine();
if(str1.equals(str2)==true)
System.out.println("Both string are equal");
else
{
System.out.println("Both string are not equal");
}
}
}