class Tone extends Thread
{
	public void run()
	{
		for(int i=1;i<50;i++)
		{
			System.out.println("i="+i);
			
		}
	}
}
class Ttwo extends Thread
{
	public void run()
	{
		for(int j=1;j<50;j++)
		{
			System.out.println("j="+j);
			
		}
	}
}
class Multithreading
{
	public static void main(String bu[])
	{
		Tone t1=new Tone();
		t1.start();
		Ttwo t2=new Ttwo();
		t2.start();
		System.out.println("exit Tone");
		System.out.println("exit Ttwo");
		
	}
}