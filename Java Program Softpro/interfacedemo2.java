interface interface1
{
void m1();
void m2();
void m3();
}
abstract class test1 implements interface1
{
public void m1()
{
System.out.println("This message from m1");
}
}
abstract class test2 extends test1
{
public void m2()
{
System.out.println("This message from m2");
}
}
class test3 extends test2   //main class
{
public void m3()
{
System.out.println("This message from m3");
}
public static void main(String bu[])
{
test3 t=new test3();
t.m1();
t.m2();
t.m3();
}
}