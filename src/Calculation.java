
public class Calculation {

	int age = 20; // instance variable
	static String name = "Poornima"; // Static variable

	static void add(int a, int b) {
		int c = a + b;
		Calculation c1 = new Calculation();
		c1.sub(100, 50);
		
		System.out.println("addition=" + c);
		System.out.println("age=" + c1.age);
		System.out.println("Name=" + name);
	

	}

	void sub(int a, int b) {
		int c = a - b;
		add(400, 500);
	//	this.mul(7, 8);

		System.out.println("Substraction=" + c);

	}

	void mul(int a, int b) {
		int c = a * b;
		sub(200,500);

		System.out.println("Multiplication" + ":" + c);
	}

	void div(int a, int b) {
		int c = a / b;
		System.out.println("Division of a and b=" + c);
	}

	public static void main(String[] args) {
		
		int num=200;//local variable
		

		add(100, 200);
		Calculation c = new Calculation();//object creation using new keyword
		c.sub(100, 50);
		c.mul(10, 10);
		c.div(30, 10);

		System.out.println("age=" + c.age);//instance
		System.out.println("Name=" + name);//static
		System.out.println("Number=" + num);//local

	}
}
