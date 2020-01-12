/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core.java.program;

/**
 *
 * @author Sachin Prajapati
 */
class AneeshDemo{
    int bill,sr;
    String date,desc;
    void setAneesh(int sr,String desc,int bill,String date){
        this.sr=sr;
        this.desc=desc;
        this.bill=bill;
        this.date=date;
    }
    void display1(){
        System.out.println("****************************************************");
        System.out.println("Sr"+"\t"+"Description "+"\t"+"Bill"+"\t"+"Date "+"\t");
        System.out.println("****************************************************");
       
    }
    void display(){
        System.out.println(+sr+"\t"+desc+"\t"+bill+"\t"+date+"\t");
    }
   void sum(){
       System.out.println("*****************************************************");
       System.out.println("Total Payable ammount :"+"2998");
        System.out.println("*****************************************************");
        System.out.println("Thank You !");
   }
      
}
public class Aneesh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AneeshDemo ad=new AneeshDemo();
        System.out.println("Name :" +" Aneesh Kumar");
        ad.display1();
        System.out.println("\n");
        
        ad.setAneesh(1,"Jio Recharge",399 , "31/10/2017");
        ad.display();
       
        ad.setAneesh(2,"Tej app     ",45,"25/12/2017");
        ad.display();
        
        ad.setAneesh(3,"Tez app     ",50,"5/01/2018");
        ad.display();
        
        ad.setAneesh(4,"Paytm   ",-15+20,"30/05/2018");
        ad.display();
        
        ad.setAneesh(5,"Jio Recharge",399,"25/06/2019");
        ad.display();
        
        ad.setAneesh(6,"Fare      ",100,"15/07/2019");
        ad.display();
        
        ad.setAneesh(7,"Mobile     ",2000,"30/09/2019");
        ad.display();
        ad.sum();
    }
    
}
