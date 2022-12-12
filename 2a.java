/*Identify the type of inheritance in the given diagram. Create a class A with two integer member
variables that are private, two float variables that are protected and two integer variables that are public.
Let class B inherit class A and class C and Class D are inherited from class B. Write appropriate
methods to illustrate the following
i) Usage of super keyword
ii) Function overriding
iii) Default constructors
iv) Parameterized constructors
v) How to we make a method not to be over ridden and a class not be inherited further*/

class A{
private int a1,a2;
protected double f1,f2;
public int b1,b2;
A(){
a1=5;
a2=10;
f1=8.5;
f2=5.2;
b1=3;
b2=8;
}
A(int x,int y)
{
a1=x;
a2=y;
}
void display()
{
System.out.println("Inside class A");
}
final void print_data()
{
System.out.println("Private Data members value: a1="+a1+" a2="+a2);
}
}
class B extends A{
B()
{
super();
}
void display()
{
System.out.println("Inside class B");
}
void data()
{
System.out.println("Protected Data members value: f1="+f1+" f2="+f2);
System.out.println("Public Data members value: b1="+b1+" b2="+b2);
}
}
class C extends B{
C()
{
super();
}
void display()
{
System.out.println("Inside class C");
}
}
final class D extends B{
D(){
super();
}
void display()
{
System.out.println("Inside class D");
}
}
class demo{
public static void main(String args[])
{
D d=new D();
C c =new C();
System.out.println("Class D:");
d.display();
d.data();
System.out.println("Class C:");
c.display();
c.data();
}
}
