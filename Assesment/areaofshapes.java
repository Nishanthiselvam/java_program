//Find the area of triangle, rectangle and circle.

package Assesment;

import java.util.Scanner;

public class areaofshapes {
 static void Circle() {
	// TODO Auto-generated method stub
	double pi=3.14;
	System.out.println("Enter value of Radius:");
	Scanner sc = new Scanner(System.in);
	float r = sc.nextFloat();
	System.out.println("Area of Cirlce:"+pi*r*r) ;
}
static void Triangle() {
	// TODO Auto-generated method stub
	double b,h;
	System.out.println("Enter values of Base and Height");
	Scanner sc = new Scanner (System.in);
	b=sc.nextDouble();
	h=sc.nextDouble();
	System.out.println("Area of Traingle:"+1/2*b*h) ;
}
static void Rectangle() {
	// TODO Auto-generated method stub
	double l,b;
	System.out.println("Enter values of Lenght and Breadth");
	Scanner sc = new Scanner (System.in);
	l=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("Area of Rectangle:"+l*b);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Area of Shapes");
	Rectangle ();
	Triangle();
	Circle();
	}
}

