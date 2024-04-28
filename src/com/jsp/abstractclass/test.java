package com.jsp.abstractclass;
abstract class shape
{
	String color;
	shape(String c)
	{
		color =c;
	}
	abstract void display();
	abstract double getArea();
}
class circle extends shape
{
	int radius;
	circle(String c,int r)
	{
		super(c);
		radius = r;
	}
	void display()
	{
		System.out.println(color+","+radius);
	}
	double getArea()
	{
		return 3.14*radius*radius;
	}
}



class rectangle extends shape
{
	int length;
	int breadth;
	rectangle(String c,int l,int b)
	{
		super(c);
		length = l;
		breadth = b;
	}
	void display()
	{
		System.out.println(color+","+length+","+breadth);
	}
	double getArea()
	{
		return length*breadth;
	}
}

public class test {

	public static void main(String[] args) {
		shape s;
		s = new rectangle("red",10,20);
		s.display();
		System.out.println(s.getArea());

	}

}
