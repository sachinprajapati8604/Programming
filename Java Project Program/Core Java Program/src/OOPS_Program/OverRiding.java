//Method overriding is method of runtime ploymorphism  

//Rewriting of base class in to the drived class

class A
        {
            void m1()
            {
                System.out.println("m1 of A");
            }
            void m2(){
                System.out.println("m2 of A");
            }
            void m3(){
                System.out.println("m3 of A");
            }
            void m4(){
                System.out.println("M4 of A");
            }
        }
        class B{
            void m2(){
                System.out.println("m2 of B");
            }
            void m3(){
                System.out.println("m3 of B");
           
            }
            void m5(){
                System.out.println("m5 of B");
            }
        }
class OverRiding {
    public static void main(String bu[])
    {
        A a=new A();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        B b=new B();
        b.m2();
        b.m3();
        b.m5();
    }
}