import java.util.*;
class LeapYear
{
	public static void main(String bu[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		year=sc.nextInt();
		if(year/4==0)
			System.out.println("this is leap year");
		else
		{
			System.out.println("this is not a leap year");
			
		}
	}
}