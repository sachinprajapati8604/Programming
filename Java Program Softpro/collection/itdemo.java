interface it
{
void m1();
void m2();

}
class itdemo implements it
{
public void m1()
{
System.out.println("This message from m1");
}

public void m2()
{
System.out.println("This message from m2");
}

public static void main(String bu[])
{
it i=new itdemo();
i.m1();
i.m2();
}
}