abstract class shape{
double area;
abstract void cal_area();
abstract void display();
}
class triangle extends shape{
int b,h;
triangle(int x,int y)
{b=x;
h=y;
}
void cal_area(){
area = 0.5*b*h;
}
void display()
{
System.out.println("Area of triangle= "+area);
}
}
class circle extends shape{
int r;
circle(int x)
{
r=x;
}
void cal_area(){
area = 3.14*r*r;
}
void display()
{
System.out.println("Area of circle= "+area);
}
}
class hexagon extends shape{
int s;
hexagon(int x)
{
s=x;
}
void cal_area(){
area = 2.6*s*s;
}
void display()
{
System.out.println("Area of hexagon= "+area);
}
}
class sphere extends circle{
sphere(int x)
{
super(x);
}
void cal_area(){
area = 4*3.14*r*r;
}
void display()
{
System.out.println("Area of Sphere= "+area);
}
}

class demo1{
public static void main(String args[])
{triangle t = new triangle(3,4);
t.cal_area();
t.display();
circle c = new circle(5);
c.cal_area();
c.display();
hexagon h = new hexagon(10);
h.cal_area();
h.display();
sphere s = new sphere(8);
s.cal_area();
s.display();
}
}
