class sachin
{
void s1()
{
System.out.println("I am sachin From s1 ");
}
void s2()
{
System.out.println("i am sachin from s2");
}
void s3()
{
System.out.println("I am sachin from s3");
}
}
class prajapati extends sachin 
{
void s4()
{
System.out.println(" I am sachin from s4 of prajapati");
}
void s2()
{
System.out.println("I am sachin from s2 of prajapati");
}
}
class overridingdemo1
{
public static void main(String bu[])
{
sachin s=new sachin();
s.s1();
s.s2();
s.s3();
prajapati p=new prajapati();
p.s4();
p.s2();
}
}