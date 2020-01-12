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
public class FuntionDemo {

    /**
     * @param args the command line arguments
     */
    //WE CAN DELCLARE FUNTION INSIDE THE MAIN CLASS OR OUTSIDE THE MAIN METHOD
    void Test(){
        System.out.println("Hello This a non static function");
    }
    static boolean Value(){
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       new  FuntionDemo().Test();    //calling non static  function by  object of main class
       staticDemo();          //here we can call the function without by main class object
     Value();
    }
    static void  staticDemo(){
        System.out.println("Hello This is Static Function");
      
    }
    
}
