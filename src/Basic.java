
public class Basic {

	int age=20;//instance variable
	static int num=60; //static variable

	
	
	//Static method
     static void add(int a, int b) {
    	 int c=a+b;
    	 Basic b1=new Basic();
    	 b1.sub(200,50);
    	 System.out.println("Add="+c);
    	 System.out.println("Age="+b1.age);
    	
     }
     
     //Non static method or instance method
     
     void sub(int a, int b) {
    	 int c=a-b;
    	 System.out.println("Sub="+c);
    	
     }
     
     public static void main(String[] args) {
    	 
    	 int age1=50;//local variable
		
    	 //static variable we can call without object reference
    	 add(200,300);
    	 
    	// another way to call static method is using class reference
    	 Basic.add(500,1000);
    	 
    	 //Non static variable or method we can call by creating object
    	 Basic b=new Basic();
    	 b.sub(500, 200);
    	 
    	 
    	 System.out.println("Number="+num);//static
    	 System.out.println("age="+b.age);//non static
    	 System.out.println("age="+age1);//local
	}
}
