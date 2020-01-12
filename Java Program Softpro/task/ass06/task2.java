class InvoiceItem
{
String id;
String desc;
int qty;
double unitPrice;
InvoiceItem(String id,String desc,int qty,double unitPrice)
{
this.id=id;
this.desc=desc;
this.qty=qty;
this.unitPrice=unitPrice;

}
String getId()
{
return id;
}
String getDesc()
{
return desc;
}
int getQty()
{
return qty;
}
double getUnitPrice()
{
return unitPrice;
}
void setQty(int qty)
{
this.qty=qty;
}
void setunitPrice(double unitPrice)
{
this.unitPrice=unitPrice;

}
double getTotal()         
{
return qty*unitPrice;
}
String tostring()
{
return "Invoice Item [id="+id+" desc="+desc+" qty="+qty+" unit price="+unitPrice+"]";
}
}
class task2
{
public static void main(String bu[])
{
InvoiceItem item=new InvoiceItem("1001","Laptop",5,35000.00);
System.out.println(item.tostring());
System.out.println("Invoice item details");
System.out.println("Id :"+item.getId());
System.out.println("Desc :"+item.getDesc());
System.out.println(" Qty :"+item.getQty());
System.out.println("Unit Price :"+item.getUnitPrice());
System.out.println("Total price :"+item.getTotal());
item.setQty(10);
item.setunitPrice(40000);
System.out.println("Modified item details ");
System.out.println("Id :"+item.getId());
System.out.println("Desc :"+item.getDesc());
System.out.println(" Qty :"+item.getQty());
System.out.println("Unit Price :"+item.getUnitPrice());
System.out.println("Total price :"+item.getTotal());
}

}


















