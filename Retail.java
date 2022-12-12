//WAJP to design and create a class named retail item that holds data about an item in a retail store.
//the class should have following fields
//1.description-the description field references that holds the brief description of item
//2.units-the  units field is an int var that holds the no.of units of item currently avail in inventry
//3.price field holds the item retail price
//write a constructor that accepts arguments for each field,appropriate methodes that stores values in these fields  and accessor methods that returns values in these fields
//write the main method wchich creates 3 retail item objects and invokkes appropriate methods

class retail{
private String desc;
private int unit;
private double price;
retail(String describe,int u,double p)
{
desc=describe;
unit=u;
price=p;
}
String get_desc()
{
return desc;
}
int get_unit()
{
return unit;
}
double get_price()
{
return price;
}
}

class test{
public static void main(String args[]){
retail r1 = new retail("Dettol soap",10,40.00);
retail r2 = new retail("Clinic plus",20,30.00);
retail r3 = new retail("Colgate",12,20.00);

System.out.println("Item details");
System.out.println("Description:"+r1.get_desc());
System.out.println("Unit:"+r1.get_unit());
System.out.println("Price:"+r1.get_price());
System.out.println("");
System.out.println("Item details");
System.out.println("Description:"+r2.get_desc());
System.out.println("Unit:"+r2.get_unit());
System.out.println("Price:"+r2.get_price());
System.out.println("");
System.out.println("Item details");
System.out.println("Description:"+r3.get_desc());
System.out.println("Unit:"+r3.get_unit());
System.out.println("Price:"+r3.get_price());
}
}
