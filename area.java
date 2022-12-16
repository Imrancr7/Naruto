 import java.lang.*;
 import java.util.Scanner;

abstract class shape
{
int a,b;
double area;
final double pi=3.14;
shape(int x,int y)
{
a=x;
b=y;
area=0;
}
abstract void printArea();
}
class Rectangle extends shape
{
Rectangle (int a,int b)
{
super(a,b);
}
void printArea()
{
area = a*b;
System.out.println("Rectangle Area=" + area);
}
}
class triangle extends shape
{
triangle (int a,int b)
{
super (a,b);
}
void printArea()
{
area = (a*b)*(0.5);
System.out.println("triangle area="+area);
}
}
class circle extends shape
{
circle (int a)
{
super (a,-1);
}
void printArea()
{
area = pi*Math.pow(a,2);
System.out.println("circle area="+area);
}
}
class Main
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of Rectangle");
int n = sc.nextInt();
System.out.println("Enter the breadth of Rectangle");
int m = sc.nextInt();
Rectangle r=new Rectangle(m,n);
System.out.println("Enter the height of triangle");
int o = sc.nextInt();
System.out.println("Enter the base of triangle");
int p = sc.nextInt();
triangle t= new triangle(o,p);
System.out.println("Enter the radius of circle");
int q = sc.nextInt();
circle c= new circle(q);
shape ref;
ref =r;
ref.printArea();
ref=t;
ref.printArea();
ref=c;
ref.printArea();
}
}
