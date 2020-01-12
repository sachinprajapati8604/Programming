/* method Overriding is method of runtime of Polymorphism */

class A
{
void m1()
{
System.out.println("m1 of A");
}
void m2()
{
System.out.println("m2 of A");
}
}
class B extends A
{
void m2()     //override method
{
System.out.println("m2 of A");
}
void m3()
{
System.out.println("m3 of B");
}
}
class overridingdemo1
{
public static void main(String bu[])
{
A a1= new A();
a1.m1();
a1.m2();
B b1=new B();
b1.m1();
b1.m2();
b1.m3();
}
}



