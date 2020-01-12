/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

/**
 *
 * @author Sachin Prajapati
 */
public class FunctionTest {

    /**
     * @param args the command line arguments
     */
    static void A(){
        System.out.println("Hello, I am in  A");
    }
    static void B(){
        System.out.println("Hello,I am in B");
    }
    static void C(){
      
        A();B();
          System.out.println("Hello ,I am in C");
    }
    static void D(){
        System.out.println("Hello ,I am in  D");
        E();F();
    }
    static void E(){
        System.out.println("Hello ,I am in E");
    }
    static void F(){
        System.out.println("Hello, I am in F");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //A();
       // B();
        C();
        D();
        //E();
        //F();
       
    }
    
}
