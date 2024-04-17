package lambda;

//below 2 interfaces are functional Interface, they both have 1 method which is abstract by default
//ignore the error on name of the interface
interface myinterface{
	void show();
//	void myShow(); if uncommented, we will get error when main is run as Unresolved compilation problems: 
//	The target type of this expression must be a functional interface -> as LambdaExpression only works on Functional Interface,
	// a functional interface can have only 1 method(this method is abstract by default)
}

//ignore the error on name of the interface
interface myinterface1{
	void show(int x, int y, int z);
}
public class AnonymousLambdaExample {

	public static void main(String[] args) {
		
		//below anonymous class has it's own implementation and definition of show()
		myinterface m1 =()->{
			System.out.println("showing");
		};
		m1.show();
		
		
		//below anonymous class has it's own implementation and definition of show(int,int,int)
		myinterface1 m2 = (int x, int y, int z)->{
			System.out.println("sum is :"+(x+y+z));
		};
		m2.show(5,10,15);
		
		//below anonymous class has it's own implementation and definition of show(int,int,int)
		m2 =(int x, int y, int z)->{
			for(int i = x;i<z;i=i+y) {
				System.out.print(i);
			}
		};
		m2.show(5, 1, 10);
	
	}


}

