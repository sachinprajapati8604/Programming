import java.util.*;
class NumCon
{
public static void main(String bu[])
{
int num;
System.out.println("Enter a number ");
num=new Scanner(System.in).nextInt();
System.out.println("Binary number format :"+Integer.toString(num,2));
System.out.println("Octal number format :"+Integer.toString(num,8));
System.out.println("Hexa decimal format :"+Integer.toString(num,16));
}
}

