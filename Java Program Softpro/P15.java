/*
replace():-is used to replace one word to another word
*/

import java.util.*;
class P15
{
public static void main(String bu[])
{
String sen,fw,rw;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Sentence");
sen=sc.nextLine();
System.out.println("Find What ?");
fw=sc.nextLine();
System.out.println("Replace with");
rw=sc.nextLine();
System.out.println("Modified Sentence :" +sen.replace(fw,rw));
}
}