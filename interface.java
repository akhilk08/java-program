import java.util.*;
interface Shape {
void area();
void perimeter();
}
class circle implements Shape {
double r;
circle(double r)
{
this.r=r;
}
public void area()
{
double a1=3.14*r*r;
System.out.println("Area of circle is :" +a1);
}
public void perimeter()
{
double p1=2*3.14*r;
System.out.println("Perimeter of circle is :" +p1);
}
}
class rectangle implements Shape {
int l,b;
rectangle(int l,int b)
{
this.l=l;
this.b=b;
}
public void area()
{
int a2=l*b;
System.out.println("Area of rectangle is :" +a2);
}
public void perimeter()
{
int p2=2*(l+b);
System.out.println("Perimeter of rectangle is :" +p2);
}
}
class Interface {
public static void main (String args[]) {
Scanner sc=new Scanner(System.in);
int ch;
do {
System.out.println("enter your choice :");
System.out.println("1.circle");
System.out.println("2.rectangle");
System.out.println("3.exit");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("enter radius :");
	double r=sc.nextDouble();
	circle circle=new circle(r);
	circle.area();
	circle.perimeter();
	break;
case 2:System.out.println("enter length :");
	 int l=sc.nextInt();
	 System.out.println("enter breadth :");
	 int b=sc.nextInt();
	 rectangle rect=new rectangle(l,b);
	 rect.area();
	 rect.perimeter();
	 break;
case 3:System.out.println("exit...");
	break;
default:System.out.println("invalid choice !");
	break;
}
}

	while(ch!= 3);
	sc.close();
}
}
