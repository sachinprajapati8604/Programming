import java.util.*;
class shop
{
    String pid;
    String desc;
    double unitprice;
    int qty;
    shop(String pid,String desc,double unitprice,int qty)
    {
    this.pid=pid;
    this.desc=desc;
    this.unitprice=unitprice;
    this.qty=qty;
    }
    
    String getPid()
    {
        return pid;
    }
    String getDesc()
    {
        return desc;
       
    }
    double getUnitprice()
    {
        return unitprice;
    }
    int getQty()
    {
        return qty;
    }
    String tostring()
    {
    return "Item List[pid="+pid+" desc="+desc+" unitprice="+unitprice+" qty"+qty+"]";
    }
    void setQty(int qty)
    {
        this.qty=qty;
   }
    void setUnitprice(double unitprice)
    {
        this.unitprice=unitprice;
    }
     double getTotal()
     {
         return qty*unitprice;
     }
    
    
}

class Customer1
{
    public static void main(String bu[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Product id :");
        String id=sc.nextLine();
        System.out.print("Enter product descrption :");
String desc=sc.nextLine();
        System.out.print("Enter Product unitprice :");
double unitprice=sc.nextDouble();
        System.out.print("Enter product quantity :");
int qty=sc.nextInt();
        shop c=new shop(id,desc,unitprice,qty);
       
       
     
    System.out.println(c.tostring());

    System.out.println("Item list details :");
    System.out.println("Product id :"+c.getPid());
    System.out.println("Description :"+c.getDesc());
    System.out.println("Uniteprice item :"+c.getUnitprice());
    System.out.println("Qty :"+c.getQty());
    System.out.println("Your total bill :"+c.getTotal());
    


    c.setQty(25);
    c.setUnitprice(12999);


    System.out.println("Modified item details ");
     System.out.println("Product id :"+c.getPid());
    System.out.println("Description :"+c.getDesc());
    System.out.println("Uniteprice item :"+c.getUnitprice());
    System.out.println("Qty :"+c.getQty());
    System.out.println("Your total bill :"+c.getTotal());
    
    
    }
}