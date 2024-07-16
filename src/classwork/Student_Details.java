package classwork;

import java.util.Scanner;

class StudentDetails {

	String studentname;
	int regnumber;

	StudentDetails(String studentname, int regnumber) {

		this.studentname = studentname;
		this.regnumber = regnumber;

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
}

class Percentage {

	double per;

	Percentage(int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {
		per = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 625 * 100;

	}
}

class Eligiblity {
	
	if (sub1>=35&& sub2>=35 && sub3>=35 && sub4>=35 && sub5>=35 && sub1>=35 ) {
		
		System.out.println("Eligible for next year");
	
		 {
			System.out.println("Not eligible");
			
		}
}
}

public class Student_Details {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Student Name:  ");
		String studentname=scan.next();
		scan.nextLine();
		
		
		System.out.println("Enter Student Registration Number:  ");
		int regnumber=scan.nextInt();
		
		System.out.println("Enter Subject1 Marks:  ");
		int sub1=scan.nextInt();
		
		System.out.println("Enter Subject1 Marks:  ");
		int sub2=scan.nextInt();
		
		System.out.println("Enter Subject1 Marks:  ");
		int sub3=scan.nextInt();
		
		System.out.println("Enter Subject1 Marks:  ");
		int sub4=scan.nextInt();
		
		System.out.println("Enter Subject1 Marks:  ");
		int sub5=scan.nextInt();
		
		System.out.println("Enter Subject1 Marks:  ");
		int sub6=scan.nextInt();
		
		 StudentDetails sd=new  StudentDetails(studentname,regnumber);
		 Subjects sub=new Subjects(sub1,sub2,sub3,sub4,sub5,sub6);
		 Percentage per=new Percentage(sub1,sub2,sub3,sub4,sub5,sub6);
		 Eligiblity el=new  Eligiblity();
		 
		 do {
			 System.out.println("******************");
			 System.out.println("Main Menu");
			 System.out.println("1.View Student Details");
			 System.out.println("2.View Subject Marks");
			 System.out.println("3.View Percentage");
			 System.out.println("4.View Eligiblity");
			 System.out.println("5.Exit");
			 System.out.println("Enter your choice from 1-5");
			 int choice=scan.nextInt();
			 
			 switch(choice) {
			 case 1:  
				       System.out.println("*****Student details*****");
				       System.out.println("Student Name:"+sd.studentname);
			           System.out.println("Register Number:"+sd.regnumber);
			           break;
			           
			 case 2:
				 System.out.println("*****Subject details*****");
				 System.out.println("subject Marks:"+sub.sub1);
				 System.out.println("subject Marks:"+sub.sub2);
				 System.out.println("subject Marks:"+sub.sub3);
				 System.out.println("subject Marks:"+sub.sub4);
				 System.out.println("subject Marks:"+sub.sub5);
				 System.out.println("subject Marks:"+sub.sub6);
				 break;
				 
			 case 3:
				   System.out.println("*****Percentage*****");
				   System.out .println("Pecentage: "+per.per);
				 break;
				 
			 case 4:
				 System.out.println("Eligible for next year:"+el);
			 break;
			 
			 case 5: 
				 return;
				 
				 default:
				 System.out.println("Invalid choice");
					 
			 
		 }while(true);
		
		
		 
	}
}
}