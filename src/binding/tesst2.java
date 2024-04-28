package binding;
class Car
{
	void start() {   }
	void acc() {     }
	void br() {       }
	
}
class Audi extends Car
{
	void start() {
		System.out.println("a start");
	}
	void acc() {
		System.out.println("a acc");
	}
	void br() {
		System.out.println("a break");
	}
}
class Rr extends Car
{
	void start() {
		System.out.println("rr start");
	}
	void acc() {
		System.out.println("rr acc");
	}
	void br() {
		System.out.println("rr break");
	}
}
class driv
{
	void drive(Car c)
	{
		c.start();
		c.acc();
		c.br();
	}
}

public class tesst2 {

	public static void main(String[] args) {
		driv d=new driv();
		d.drive(new Audi());
		d.drive(new Rr());
		

	}

}
