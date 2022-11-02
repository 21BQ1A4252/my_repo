import java.util.Scanner;
class Invoice{
   String part_no, part_desc;
   int quantity;
   double p_i, total=0.0;
Invoice(){
String part_no="",part_desc="";
int quantity=0;
double p_i=0.0;
}
public String getPart_no(){
 return part_no;
}
public void setPart_no(String part_no){
  this.part_no=part_no;
}
public String getPart_desc(){
return part_desc;
}
public void setPart_desc(String part_desc){
this.part_desc=part_desc;
}
public int getQuantity(){
return quantity;
}
public void setQuantity(int quantity){
if(quantity<0)
   quantity=0;
else
   this.quantity=quantity;

}
public double getP_i(){

  return p_i;
}
public void setP_i(double p_i){
if(p_i<0)
  p_i=0.0;
else
  this.p_i=p_i;
}
double getInvoiceAmount(){
 totalprice();
 return total;
}
void totalprice(){
total=total+getQuantity()*getP_i();
}
}
public class InvoiceDemo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Invoice in =new Invoice();
System.out.println("enter part no:");
in.setPart_no(sc.nextLine());
System.out.println("enter part description:");
in.setPart_desc(sc.nextLine());
System.out.println("enter quantity:");
in.setQuantity(sc.nextInt());
System.out.println("enter price of items:");
in.setP_i(sc.nextDouble());
System.out.println("total biling :"+ in.getInvoiceAmount());
}
}
 
