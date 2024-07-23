package classwork;
import java.util.Scanner;
public class User_Input {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student name");
		String name=sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter Address of Student");
		String address=sc.nextLine();
		
		System.out.println("Enter Student age");
		int age=sc.nextInt();
		
		System.out.println("Enter Character");
		char c=sc.next().charAt(0);
		
		System.out.println("Student name"+":"+name);
		System.out.println("Student address"+"::" +address);
		System.out.println("Student age=" +age);
		System.out.println("Character=" +c);
	}

}
