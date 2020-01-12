/* String is a class available in java.lang package.
toUpperCase():-This method convert string into upper case
toLowerCase():- This method convert string into lower case
lenght():-This method find the lenght of string

*/

import java.util.*;
class P13
{
public static void main(String bu[])
{
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your name");
name=sc.nextLine();
System.out.println("Upper case: "+name.toUpperCase());
System.out.println("Lower case :"+name.toLowerCase());
System.out.println("Lenght : "+name.length());
}
}