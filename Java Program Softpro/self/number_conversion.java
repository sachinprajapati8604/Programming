/*
Number conversion 
*/

import java.util.*;
class number_conversion
{
public static void main(String bu[])
{
int num;
System.out.println("Enter a number");
num=new Scanner(System.in).nextInt();
System.out.println("Binary format are :"+Integer.toString(num,2));
System.out.println("Ocatal format are :"+Integer.toString(num,8));
System.out.println("Hexa decimal format are :"+Integer.toString(num,16));

}
}


