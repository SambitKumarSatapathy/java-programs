package com.jsp.defaultmethod;
interface i
{
	void m1();
	default void m2() {
		System.out.println("m2 in i");
	}
}
class A implements i
{
	public void m1() {
		System.out.println("m1 in a");
	}
	public void m2() {
		System.out.println("m2 in a");
	}
}
class N implements i
{
	public void m1() {
		System.out.println("m1 in b");
	}
}

public class test {

	public static void main(String[] args) {
		A a=new A();
		a.m2();
		i c=new N();
		c.m2();
	}

}
