package Package1;
import java.util.Scanner;

public class PrintingName {
	
	
	//What happened when we don’t put static in main method?
	/* the keyword static indicates that the method is a class method which can be called without creating an 
	   object of the class. If we don't declare main static a run-time error will occur while running the code 
	   saying main() is not declared yet. JVM won't be able to run the method because JVM itself can't create a 
	   object of the class. */
	
	//What does Void mean??
	/* The void keyword when used as the return type for any Java methods indicates that the method does not 
	 * return anything.
	 */
	
	
	//What does main mean in a main method??
	/* The word main symbolizes the name of the method. In stead of using main we can use any other name but in that 
	 * case we have to go inside JVM and replace main with the particular keyword we nt to use. */
	
	//What is the main method syntax??
	/* public static void main(String[] args) */
	
	//What is String[] args?? explain it.
	/* The formal parameter args is an array of type String, which contains arguments entered at the command line.
	 * Main method only accepts String of array as parameter. 
	 * Instead of args we can use any name/keyword.
	 */
	
	
	//What is JAVA
	/* Java is a widely used programming language which is class based and object oriented. 
	 * It follws the OOPs concepets : Abstraction, Encapsulation, Inheritence and Polymorphism
	 */
	
	
	
	//
	
	
	//How to add comments and what are the different types of comments??
	/* The java comments are statements that are not executed by the compiler 
	 * There are 3 types of comments in java.
		Single Line Comment  -->  we have to use //
		Multi Line Comment   --> we have to use /* */ 
	/*  Documentation Comment --> /** */
	
	
	// Explain System.out.println()??
	/* System.out.println is a Java statement that prints the argument passed, into the System.out 
		 
		 System is a Class
         out is a Variable
         println() is a method
         
	   System is a class in the java.lang package . The out is a static member of the System class, and is an 
	   instance of java.io.PrintStream . The println() is a method of java.io.PrintStream. This method is overloaded to 
	   print message to output destination
	  */

	
	//Difference between prinln() and print()
	/* Both methods are used to print data on console, the only difference between above two methods is 
	  'System.out.println' prints data and place the cursor in next line. So the next coming output prints 
	  in the next line whereas 'System.out.print' prints data and place the cursor in the same line. 
	  So the next coming output prints in the same line.
	 */
	
	
	//How to convert integers to String
	/* By using the String.valueOf() method. It is the static method of String class (example given inside main method)
	   By using the Integer.toString() method. It is the static method of Integer class (example given inside main method)
	 */
	
	
	//How to convert String to integer
	/* We can convert String to an int in java using Integer.parseInt() method. 
	   We can also use Integer.valueOf() method of integer class.
	   example given inside main method
	   Note: if the string does not contain a parsable integer, a NumberFormatException will be thrown.
	 */
	
	
	//How to reverse a string
	/*
	 By Using StringBuffer/StringBuilder class and  reverse method of these classes;
	 we can also do it through Iteration using for loop
	 example inside main method
	 */
	
	
	//What is typecasting??
	/* 
		Not able to completely understand this concept.
	 */
	
	//What are the data types in Java?
	/* Data types specify the different sizes and values that can be stored in the variable. 
	   There are two types of data types in Java:

	   Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
       Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
	 
	 */
	
	//What are the operators in Java??
	/*
		Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups −

		Arithmetic Operators --> + , - , * , / , % , ++ , --
		Relational Operators --> == , != , > , < , >= , <= 
		Bitwise Operators
		Logical Operators --> && , ||
		Assignment Operators
		Misc Operators


	 */
	
	
	
	
	
	
	public static void main(String[] Jishan) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Jishan, Welcome back to JAVA again.");
		
		System.out.println("Hopefully, you will be able learn core JAVA well this time.");
		
		/*int a = 26;
		char c = 'A';
		
		System.out.println(a);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		//converting int into string
		int i=10;  
		String s=String.valueOf(i);//Now it will return "10" 
		System.out.println(s);
		
		int j = 20;
		String s1= Integer.toString(j);
		System.out.println(s1);
		
		//converting string into int
		String A1 = "10";
		int i1 = Integer.parseInt(A1);
		System.out.println(i1);
		
		int j1 = Integer.valueOf(A1);
		System.out.println(j1);
		
		//StringBuffer, StringBuilder
		
		String ss = "Biswas";
		String reverse = new StringBuffer(ss).reverse().toString();
		System.out.println(reverse);
		
		
		int x = 10;
		int y = 7;
		
		double x1 = x;
		double y1 = y;
		
		double resultt = x1/y1;
		
		System.out.println(resultt);
		
		*/
		
		Scanner jishan = new Scanner(System.in);
		System.out.println("Enter Two integer please: ");
		int p = jishan.nextInt();
		int q = jishan.nextInt();
		
		System.out.println("Addition: "+ (p+q));
		
		System.out.println("Substraction: "+ (q-p));
		
		System.out.println("Multiplication: "+ (p*q));
		
		System.out.println("Division: "+ (q/p));
		
		System.out.println("Remainder: "+ (q%p));
		
		int max;
		int x =10;
		int y =20;
		
		
		max =x;
		x= y;
		y=max; 
		
		System.out.print(x + " and "+ y);
		/*int temp = p;
		p = q;
		temp = q;
		
		
		System.out.print(p + " and "+ q);;*/
		
	}

}
