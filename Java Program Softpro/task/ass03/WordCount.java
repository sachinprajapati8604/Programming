import java.util.*;
class WordCount
{
public static void main(String bu[])
{
String sen;
int count=1,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Sentence");
sen=sc.nextLine();
for(i=0;i<sen.length();i++)
{
if(sen.charAt(i)==' ' && sen.charAt(i+1)!=' ')
count++;
}
System.out.println("Total words in sentence is present :"+(count));

}
}