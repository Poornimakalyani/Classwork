package classwork;


import java.util.Scanner;

public class StudentDetails_1 {
	
	static int total;
	static float percentage1;
	static int sub1;
	static int sub2;
	static int sub3;
	static int sub4;

	void displaystudentdetails(String student_name,int uan_number,String department) {
		System.out.println("Student name:"+student_name);
		System.out.println("Student Uan number:"+uan_number);
		System.out.println("Student department:"+department);
	}
	void dispalymarks(String student_name, int sub1,int sub2,int sub3,int sub4,int total,float percentage) {
    	total= (sub1+sub2+sub3+sub4);
		percentage1=(float)total/400*100; 
		
		System.out.println("Student name:"+student_name);
		
		System.out.println("The Total marks is :"+total);
		
		System.out.println("Percentage is :"+ percentage1);
		
		if (percentage1>=35) {
			System.out.println("Eligible for next year");
		}
		
			
		else {
			System.out.println("Not Eligible for next year");
				
			}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StudentDetails_1 sd=new StudentDetails_1();
		
		System.out.println("Enter Student name");
		String n=scan.nextLine();
		
		System.out.println("Enter Student UAN Number");
		int u=scan.nextInt();
		
		System.out.println("Enter Department name");
		String d=scan.next();
		
		scan.nextLine();
	
		
		System.out.println("Enter Sub1 English marks");
		int s1=scan.nextInt();
		
		System.out.println("Enter Sub2 Maths marks");
		int s2=scan.nextInt();
		
		System.out.println("Enter Sub3 Science marks");
		int s3=scan.nextInt();
		
		System.out.println("Enter Sub4 Kannada marks");
		int s4=scan.nextInt();
		
		
        do {
			System.out.println("********");
			System.out.println("1.Display Student Details");
			System.out.println("2.Display Student marks");
			System.out.println("3.exit");
			System.out.println("Enter your choice 1-3");
			System.out.println("********");
			int choice=scan.nextInt();
			
			switch (choice) {
			case 1:
				sd.displaystudentdetails(n,u,d);
				break;
			case 2:
				sd.dispalymarks(n,s1,s2,s3,s4,total,percentage1);
				break;
				
			case 3:
				System.out.println("Exit");
				return;
				
				default:
					System.out.println("Invalid choice");
			}
			
		}while(true);	
		
		
	}
}
