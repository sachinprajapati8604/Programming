 import java.util.*;
 

 abstract class Bike
{
	abstract void break system();
	void about()
	{
		System.out.println("BIke is used for travelling");
		
	}
}
class Avenger extends Bike 
{
	void break system()
	{
		System.out.println("It is used for stooping");
		
	}
}
class Abstract

{
	public static void main(String bu[])
	{
		Bike b=new Bike ();
		Avenger a=new Avenger();
		a.breaksystem();
		a.about();
		
	}
	
	
}