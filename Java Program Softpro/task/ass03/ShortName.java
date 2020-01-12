import java.util.*;
class ShortName
{
public static void main(String bu[])
{
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your full name");
name=sc.nextLine();
String [] sh=name.split("");
System.out.print("Your short name :");
for(int i=0;i<sh.length-1;i++)
{
System.out.print(sh[i].charAt(0)+".");
}
System.out.print(sh[sh.length-1]);
}
}
