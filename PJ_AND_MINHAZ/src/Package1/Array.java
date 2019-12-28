package Package1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int jishan[] = {1,2,3,4,5};
		
		System.out.print("[");
		for (int i=0; i<jishan.length; i++){
			
			System.out.print(jishan[i]);
			if (i < (jishan.length-1)){
			System.out.print(",");
			}
			}
		System.out.print("]");
		
		System.out.println();
		
		
		//HW folksInCurrentClass in a nice format such as this [PJ, Jishan, Saera,
		// Sabrina, Musaib]
		
		String folksInCurrentClass [] = {"Jishan", "PJ", "Saera", "Sabrina", "Musaib", "Minhaz"};
		System.out.println(folksInCurrentClass.length);
		System.out.print("[");
		for (int j=0; j<folksInCurrentClass.length; j++){
			
			System.out.print(folksInCurrentClass[j]);
			if(j< (folksInCurrentClass.length-1)){
				System.out.print(", ");
			}
			
			
		}
		System.out.print("]");
		
		System.out.println(folksInCurrentClass[folksInCurrentClass.length-2]);
		
		System.out.println(folksInCurrentClass[3]);
		
		
		// How converted into nice sentence format from [I, love, JAVA] to I love JAVA
		
		String sentence[] = {"I", "Love", "JAVA"};
		
		for (int i=0; i<sentence.length; i++){
			
			System.out.print(sentence[i]+ " ");
		}
		
		
		
		//
		System.out.println();
		int number [] = new int[5];
		
		number[0] = 10;
		number[1] = 15;
		number[2] = 20;
		number[3] = 25;
		number[4] = 30;
		
		System.out.println(number[2]);
		System.out.println(number.length);
		
		// creation of multi dimensional array
		
		int numbertwo [][] = new int [4][3];
		
		numbertwo [0][0] = 1; 
		numbertwo [0][1] = 2;
		numbertwo [0][2] = 3;
		
		
		
		numbertwo [1][0] = 5;
		numbertwo [1][1] = 6;
		numbertwo [1][2] = 7;
		
		
		
		numbertwo [2][0] = 9;
		numbertwo [2][1] = 10;
		numbertwo [2][2] = 11;
		
		 
		numbertwo [3][0] = 14;
		numbertwo [3][1] = 15;
		numbertwo [3][2] = 16;
		
		
		//System.out.println(numbertwo.length);
		
		for (int i=0; i<numbertwo.length; i++){
			
			for (int j=0; j<numbertwo[i].length; j++){
				System.out.print(numbertwo[i][j] + "    ");
			}
			
			System.out.println();
		}
		*/
		
		/*
		 * coordinates array = { {0,1}, {0,2}, {0,3}, {1,1}, {1,2}, {1,3}}
		 * 
		 * Expected out to be like coordinates [0,1] , [0,2], [0,3], [1,1], [1,2], [1,3]
		 * 
		 * Sample code
		 */
		
		
		int numberThree [][] = {{0,1},{2,3},{4,5},{6,7},{8,10}};
		
		
		for (int p=0; p<numberThree.length; p++){
			
			System.out.print("[");
			
			for (int q=0; q<numberThree[p].length; q++){
		
			System.out.print(numberThree[p][q]);
			
			if (q <numberThree[p].length-1){
				System.out.print(",");
			}
			
			}
			
			System.out.print("]");
			if (p < numberThree.length-1){
				System.out.print(" , ");
			}
			
		}
		
	
	}

}
