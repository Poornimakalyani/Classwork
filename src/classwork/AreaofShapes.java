package classwork;

public class AreaofShapes {

	
	//hello
	void area_of_square(int a) {
		int c = a * a;
		System.out.println("Area of Square:" + c);
	}

	void area_of_rectangle(int l, int b) {
		int c = l * b;
		System.out.println("Area of Rectangle:" + c);
	}

	void area_of_triangle(double b, double h) {
		double c = 0.5 * (b * h);
		System.out.println("Area of Traingle:" + c);
	}

	void are_of_circle(double r) {
		double c = 3.14 * r * r;
		System.out.println("Area of circle:" + c);
	}

	public static void main(String[] args) {
		AreaofShapes a = new AreaofShapes();
		a.area_of_square(4);
		a.area_of_rectangle(6, 5);
		a.area_of_triangle(5, 7);
		a.are_of_circle(3.5);
	}

}
