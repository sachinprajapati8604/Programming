//WAP calaculate the groos salary of employee


import java.util.*;
class P2
{
public static void main(String bu[])
{
int sal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your salary");
sal=sc.nextInt();
if(sal<=4000)
{
System.out.println("Your HRA is 30% and DA is 50%");
System.out.println("Your Gross Salary is="+(sal+(sal*10/100+sal*50/100)));
}
else if(sal>4000&&sal<=8000)
{
System.out.println("Your HRA is 200% and DA is 60%");
System.out.println("Your Gross Salary is="+(sal+(4000*10/100+4000*50/100+(sal-4000)*20/100+(sal-4000)*60/100)));
}
else if(sal>8000&&sal<=12000)
{
System.out.println("Your HRA is 25% and DA is 70%");
System.out.println("Your Gross Salary is="+(sal+(4000*10/100+4000*50/100+8000*20/100+8000*60/100+(sal-8000)*25/100+(sal-8000)*70/100)));
}
else 
{
System.out.println("Your HRA is 30% and DA is 80%");
System.out.println("Your Gross Salary is="+(4000*10/100+4000*50/100+8000*20/100+8000*60/100+12000*25/100+12000*70/100+(sal-12000)*30/100+(sal-12000)*80/100));
}
}
}