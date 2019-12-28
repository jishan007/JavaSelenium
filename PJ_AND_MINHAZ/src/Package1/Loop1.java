package Package1;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Jishan = new Scanner(System.in);
		/*System.out.println("Please enter an integer: ");
		int a = Jishan.nextInt();
		
		for(int i=a; i==a; i++){
			
			for (int j = 1; j<=10; j++){
				
				int result = i*j;
				System.out.println(i +" x "+j + " = "+ result);
			}
		}
		
		
		
		//reversing an Integer number
		
		int p = 2435;
		
		String s = String.valueOf(p);
		
		String reverse = new StringBuilder(s).reverse().toString();
		
		
		int reverseNumber = Integer.valueOf(reverse);
		
		System.out.println(reverseNumber);
		
		System.out.println(reverseNumber+10);
		
		*/
		
		//split number in digit and find the sum of the digits
		
		int a1 = 123457896;
		
		String s1 = String.valueOf(a1);
		
		//int i3 =0;
		
		for (int i1 =0; i1<s1.length(); i1++) {
			char c1 = s1.charAt(i1);
			int i2 = Character.getNumericValue(c1);
			System.out.print(i2);
			
			//i3 = i3+i2;
		}
		//System.out.println(i3);
	
	}

}
