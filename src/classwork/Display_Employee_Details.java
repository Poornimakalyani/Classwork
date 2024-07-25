package classwork;

public class Display_Employee_Details {
	
	
	static String emp_Names[]= {"Poornima","Shriya","Harshitha","Preeti","Naveen"};
	static int emp_Salary[]= {20000,18000,15000,10000,14000};
	static int[] emp_id= {123,456,789,111,222};
	String company_Name= "Dell";
	
	/*
	 * void display() { for(int i=0;i<emp_Names.length;i++) {
	 * System.out.println("Employee Name:"+emp_Names[i]);
	 * System.out.println("Salary of Employee:"+emp_Salary[i]);
	 * System.out.println("Employee Id:"+emp_id[i]);
	 * System.out.println("Company Name:"+company_Name); } }
	 */
	public static void main(String[] args) {
		
		 Display_Employee_Details details=new  Display_Employee_Details();
		 //details.display();
		 
		 for(int i=0;i<emp_Names.length;i++) {
			 if (emp_Salary[i] >= 15000) {
				 
				    System.out.println("Employee details who is having salary above 15000");
					System.out.println("Employee Name: " +emp_Names[i]);
					System.out.println("Employee ID: " +emp_id[i]);
					System.out.println("Salary of Employee: " +emp_Salary[i]);
					System.out.println("Company Name: " +details.company_Name);
					System.out.println("---------------");
				}
			
			}
		}
	}