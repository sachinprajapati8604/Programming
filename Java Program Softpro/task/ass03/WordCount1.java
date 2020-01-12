import java.util.*;
class WordCount1
{
public static void main(String bu[])
{
String sen;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence");
sen=sc.nextLine();
String []words=sen.split(" ");
System.out.println("No.of words ="+words.length);
}
}