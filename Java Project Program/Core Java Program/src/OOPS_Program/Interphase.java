interface Myinterface
{
    void m1();   //abstarct void m1();
    void m2();   //abstarct void m2();
}
class TestInterface implements Myinterface
{
    public void m1()
    {
        System.out.println("This message from m1");
    }
    public void m2()
    {
        System.out.println("This message from m2");
    }
    public static void main(String[] args) {
        TestInterface ti=new TestInterface();
        ti.m1();
        ti.m2();    
    }
}