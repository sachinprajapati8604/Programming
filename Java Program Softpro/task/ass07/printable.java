interface printable
{
public abstract void print();
}
class P2 implements printable
{
public void print()
{
System.out.println("Hello World");
}
public static void main(String bu[])
{
P2 p=new P2();
p.print();
}
}