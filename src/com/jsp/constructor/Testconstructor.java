package com.jsp.constructor;
class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public void show()
	{
		System.out.println("i ="+ this.i);
	}
}

public class Testconstructor {

	public static void main(String[] args) {
		A s=new A(100);
		A d=new A(300);
		s.show();
		d.show();

	}

}
