import java.util.*;
class shop
{
    String pid;
    String desc;
    double unitprice;
    int qty;
    shop(String pid,String desc,double unitprice,int qty)      //using constructor
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

class Customer
{
    public static void main(String bu[])
    {
       
    shop c=new shop("1001","Moblie",10000.00,5);
    shop c1=new shop("A77","Laptop",38000.00,5);
    shop c2=new shop("1Bb1","Books",100.00,85);
       
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
    
    
        
    System.out.println(c1.tostring());
    System.out.println("Item list details :");
    System.out.println("Product id :"+c1.getPid());
    System.out.println("Description :"+c1.getDesc());
    System.out.println("Uniteprice item :"+c1.getUnitprice());
    System.out.println("Qty :"+c1.getQty());
    System.out.println("Your total bill :"+c1.getTotal());
    c1.setQty(25);
    c1.setUnitprice(12999);
    System.out.println("Modified item details ");
     System.out.println("Product id :"+c1.getPid());
    System.out.println("Description :"+c1.getDesc());
    System.out.println("Uniteprice item :"+c1.getUnitprice());
    System.out.println("Qty :"+c1.getQty());
    System.out.println("Your total bill :"+c1.getTotal());
    
    
        
    System.out.println(c2.tostring());
    System.out.println("Item list details :");
    System.out.println("Product id :"+c2.getPid());
    System.out.println("Description :"+c2.getDesc());
    System.out.println("Uniteprice item :"+c2.getUnitprice());
    System.out.println("Qty :"+c2.getQty());
    System.out.println("Your total bill :"+c2.getTotal());
    c2.setQty(15);
    c2.setUnitprice(45999);
    System.out.println("Modified item details ");
     System.out.println("Product id :"+c2.getPid());
    System.out.println("Description :"+c2.getDesc());
    System.out.println("Uniteprice item :"+c2.getUnitprice());
    System.out.println("Qty :"+c2.getQty());
    System.out.println("Your total bill :"+c2.getTotal());
    
    
    }
}