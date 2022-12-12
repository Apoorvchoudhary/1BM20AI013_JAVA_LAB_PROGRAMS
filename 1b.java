class car{
int model;
String make;
int speed;
car(int mo,String ma,int s)
{
model=mo;
make=ma;
speed=s;
}
void display()
{
System.out.println("Car Details");
System.out.println("Car model:"+model);
System.out.println("Car make:"+make);
System.out.println("Car speed:"+speed);
}
int accelerate()
{
speed=speed+5;
return speed;
}
int brake()
{
speed=speed-5;
return speed;
}
}

class test1{
public static void main(String args[])
{
car c = new car(2020,"BMW",60);
c.display();
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());
System.out.println("\nNew speed after acceleration: "+c.accelerate());

System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
System.out.println("\nNew speed after brake: "+c.brake());
}
}
