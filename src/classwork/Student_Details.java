package classwork;

import java.util.Scanner;

class StudentDetails {

	String studentname;
	int regnumber;

	StudentDetails(String studentname, int regnumber) {

		this.studentname = studentname;
		this.regnumber = regnumber;

	}

	void display_Student_Details() {
		System.out.println("*****Student details*****");
		System.out.println("Student Name: " + studentname);
		System.out.println("Register Number: " + regnumber);
	}

}

class Subjects {

	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;
	int sub6;

	Subjects(int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;

	}

	void display_Subject_Details() {
		System.out.println("*****Subject details*****");
		System.out.println("Subject 1 Marks: " + sub1);
		System.out.println("Subject 2 Marks: " + sub2);
		System.out.println("Subject 3 Marks: " + sub3);
		System.out.println("Subject 4 Marks: " + sub4);
		System.out.println("Subject 5 Marks: " + sub5);
		System.out.println("Subject 6 Marks: " + sub6);
	}
}

class Percentage {

	double totalMarks;
	double percentage;

	Percentage(int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {
		totalMarks = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6);
		percentage = ((totalMarks / 600) * 100);
	}

	void display_percentage() {
		System.out.println("*****Percentage Details*****");
		System.out.println("Total marks:" + totalMarks);
		System.out.println("Percentage: " + percentage);

	}

	void displayEligibility() {
		if (percentage > 35) {
			System.out.println("Eligible for Next Year");
		} else {
			System.out.println("Not Eligible for Next Year");
		}
	}

	public class Student_Details {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter Student Name: ");
			String studentname = scan.next();
			scan.nextLine();

			System.out.println("Enter Student Registration Number:  ");
			int regnumber = scan.nextInt();

			System.out.println("Enter Subject1 Marks:  ");
			int sub1 = scan.nextInt();

			System.out.println("Enter Subject1 Marks:  ");
			int sub2 = scan.nextInt();

			System.out.println("Enter Subject1 Marks:  ");
			int sub3 = scan.nextInt();

			System.out.println("Enter Subject1 Marks:  ");
			int sub4 = scan.nextInt();

			System.out.println("Enter Subject1 Marks:  ");
			int sub5 = scan.nextInt();

			System.out.println("Enter Subject1 Marks:  ");
			int sub6 = scan.nextInt();

			StudentDetails sd = new StudentDetails(studentname, regnumber);
			Subjects sub = new Subjects(sub1, sub2, sub3, sub4, sub5, sub6);
			Percentage per = new Percentage(sub1, sub2, sub3, sub4, sub5, sub6);

			while (true) {
				System.out.println("******************");
				System.out.println("Main Menu");
				System.out.println("1.View Student Details");
				System.out.println("2.View Subject Details");
				System.out.println("3.View Percentage");
				System.out.println("4.View Eligiblity");
				System.out.println("5.Exit");
				System.out.println("Enter your choice from 1-5");
				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					sd.display_Student_Details();
					break;

				case 2:
					sub.display_Subject_Details();
					break;

				case 3:
					per.display_percentage();
					break;

				case 4:
					per.displayEligibility();
					break;

				case 5:

					return;

				default:
					System.out.println("Invalid choice");
				}
			}
		}
	}
}
