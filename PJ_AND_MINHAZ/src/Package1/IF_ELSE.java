package Package1;

import java.util.Scanner;

public class IF_ELSE {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner Jishan = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		int grade = Jishan.nextInt();
		
		
		if (grade>100 || grade<0) {
			System.out.println("You have entered invlid grade.");
		}
		
		else if (grade >=95 && grade <=100) {
			System.out.println("Your grade is A and you are an excellent student.");
		}
		
		else if (grade >=90 && grade <95) {
			System.out.println("Your grade is A and you are a good student.");
		}
		
		else if (grade >=80 && grade <90) {
			System.out.println("Your grade is B.");
		}
		
		else if (grade >=70 && grade <80) {
			System.out.println("Your grade is C.");
		}
		
		else if (grade >=60 && grade <70) {
			System.out.println("Your grade is D.");
		}
		
		else{
			System.out.println("You failed in the exam.");
		}
		
		/*
		
		//minhaz lb to kg
		
		
		Scanner musaib = new Scanner(System.in);
		System.out.println("please enter your weight: ");
		String weight = musaib.nextLine();
		
		2String weight = "28";
		double weight1 = Integer.parseInt(weight);
		
		
		if (weight1>0 && weight1<=40 ){
			
			System.out.println("Your weight is: " + (weight1*2.21) + "lb.");
		}
		else if (weight1>40 && weight1<=500) {
			System.out.println("Your weight is: " + (weight1/2.21) + "kg.");
		}
		
		else  {
			System.out.println("Either you entered invlid weight or you are overweight.");
		}
		
		
		
		
		//Print “Enter valid age” error if age <0 and greater then 500
		
		Scanner jishan1 = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		double age = jishan1.nextDouble();
		
		if (age<0 || age>500) {
			System.out.println("Enter valid age, please.");
		}
		else{
			
		}
		
		//If unit is wrong (not K or L) print “Entered invalid unit!” error
		
		System.out.println("*****************");
		
		Scanner jishan2 = new Scanner(System.in);
		System.out.println("Please enter K for kg, L for pound: ");
		String weight = jishan2.nextLine();
		String s1 = "k";
		String s2 = "l";
		
		if (weight.equalsIgnoreCase(s1) || weight.equalsIgnoreCase(s2)){
			
		}
		
		else {
			System.out.println("Entered invalid unit! ");
		}
		
		System.out.println("******************");
		
		
		//Handle if the user puts upper case or lower case L and K as unit
		
		Scanner jishan3 = new Scanner(System.in);
		System.out.println("Please enter K for kg, L for pound: ");
		String weight1 = jishan3.nextLine();
		String weight2 = weight1.toUpperCase();
		
		String s3 = "K";
		String s4 = "L";
		
		if (weight2.equals(s3) || weight2.equals(s4)){
			System.out.println("You have entered K or L.");
		}
		
		
		Scanner jishanThree = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		
		int voterAge = jishanThree.nextInt();
		
		if (voterAge>=18 && voterAge <=150){
			System.out.println("You are eligible to vote.");
		}
		else if (voterAge >150){
			System.out.println("Please submit a copy of your birth certificate.");
		}
		else if (voterAge >= 1 && voterAge <18){
			System.out.println("Sorry, you are not elegible for voting.");
		}
		else{
			System.out.println("You have entered an invalid age number.");
		}
		*/

	}

}
