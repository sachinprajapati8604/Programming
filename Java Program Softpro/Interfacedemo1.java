interface MyInterface
{
void m1();     //public abstract void m1();
void m2();     //public abstract void m2();
}
class TestInterface implements MyInterface       //main class 
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
TestInterface t=new TestInterface();
t.m1();
t.m2();
}
}