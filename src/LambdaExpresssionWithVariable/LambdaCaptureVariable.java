package LambdaExpresssionWithVariable;

//Interface 
interface MyInterface { 

 // Method inside the interface 
 void myFunction(); 
} 

//Main class 
public class LambdaCaptureVariable { 

 // such class level local variable can be accessed and modified inside lambda function
 int data = 170; 

 // Main driver method 
 public static void main(String[] args) 
 { 

     // Creating object of this class 
     // inside the main() method 
	 LambdaCaptureVariable gfg = new LambdaCaptureVariable(); 

     // Creating object of interface 
     // inside the main() method 
     MyInterface intFace = () -> 
     { 
         System.out.println("Data : " + gfg.data); 
         gfg.data += 500; 

         System.out.println("Data : " + gfg.data); 
     }; 

     intFace.myFunction(); 
     gfg.data += 200; 

     System.out.println("Data : " + gfg.data); 
 } 
}