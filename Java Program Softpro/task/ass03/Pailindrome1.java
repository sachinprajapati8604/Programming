import java.util.*;
class Pailindrome1
{
public static void main(String bu[])
{
String str,revstr="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
str=sc.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
revstr=revstr+str.charAt(i);
}
if(str.equalsIgnoreCase(revstr)==true)
{
System.out.println("String is Pailindrome");
}
else
{
System.out.println("String is not Pailindrome");
}
}
}