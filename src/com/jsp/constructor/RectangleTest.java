package com.jsp.constructor;
class Rectanglew
{
	int length;
	int breadth;
	Rectanglew()
	{
		length = 5;
		breadth = 7;
	}
	Rectanglew(int value)
	{
		length = value;
		breadth = value;
	}
	Rectanglew(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void displayArea()
	{
		System.out.println("len"+length+"   breadth"+breadth);
	}
	public void calArea() {
		int area = length*breadth;
		
		System.out.println(area);
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectanglew r =new Rectanglew();
		r.displayArea();
		r.calArea();
		
		Rectanglew r1 =new Rectanglew(4);
		r1.displayArea();
		r1.calArea();
		
		Rectanglew r2 =new Rectanglew(9,8);
		r2.displayArea();
		r2.calArea();
		

	}

}
