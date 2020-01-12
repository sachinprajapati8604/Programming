//WAP to accept a cordinate point in a XY cordinate system and determine its quardent..

import java.util.*;
class P1
{
public static void main(String bu[])
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Cordinate point x then y") ;
x=sc.nextInt();
y=sc.nextInt();
if(x>0&&y>0)
{
System.out.println("Quardinate point in 1st Quardent in XY plane");
}
else if(x<0&&y>0)
{
System.out.println("Quardinate point in 2nd Quardent in XY plane");
}
else if(x<0&&y<0)
{
System.out.println("Quardinate point in 3rd Quardent in XY plane");
}
else
{
System.out.println("Quardinate point in 4th Quardent in XY plane");
}
}
}