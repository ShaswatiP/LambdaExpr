package lambda;

//Java Program to Demonstrate Anonymous inner class 

//Interface 
interface Age { 
	//int x = 21; Functional Interfaces can't have fields, they can only have abstract methods like below 
	void getAge(); 
} 

//Main class 
class AnonymousDemo { 
	
	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Myclass is hidden inner class of Age interface 
		// whose name is not written but an object to it 
		// is created. 
		Age oj1 = new Age() { 
			
			@Override 
			public void getAge() 
			{ 
				// printing age 
				System.out.println("Age is " +30);
			} 
		}; 
		
		oj1.getAge(); 
		
		Age oj2 = ()->{
			System.out.println("Age is " +30);
		};
		oj2.getAge();
	} 
}
