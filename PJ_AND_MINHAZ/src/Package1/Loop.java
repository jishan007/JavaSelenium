package Package1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*; 

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//While Loop
		
		int a=1;
		
		while(a<11){
			System.out.println("The value of a is: "+ a);
			a++;
		}
		
		System.out.println();
		System.out.println("********************");
		System.out.println();
		
		//For Loop
		
		for (int i=11; i<21; i++){
			System.out.println("The value of i is: "+ i);
		}
		
		
		System.out.println();
		System.out.println("********************");
		System.out.println();
		
		
		//Do While Loop
		
		int p=21;
		
		do {
			System.out.println("The value of p is: "+ p);
			p++;
		}
		while(p<=29);

	}    
			ArrayList <Integer> jishan = new ArrayList<Integer>();
			for (int i=3; i<=100; i++){
				
				for (int j=2 ; j<i; j++){
					
					if(i%j == 0) {
						break;
					}
					else if (i%j !=0){
						//System.out.println(i);
						if(i== (j+1)){
						jishan.add(i);
						}
					}
				}
			}
			
			System.out.println(jishan);
			
		int jishan1 [] = {1,2,3,4,5,1,2,3};
		
		for (int i=0; i<jishan1.length; i++){
			System.out.println(jishan1[i]);
		}
		
		System.out.println(jishan1[1]);
		
		int p = jishan1[1]+jishan1[2];
		System.out.println("******"+p);
		*/
		
		int jishan2 [] = {1,4,6,8,10,12,14,16,19,20};
		
		System.out.print("{");
		
		for (int i=0; i<jishan2.length; i++){
			
			
			for(int j=i+1; j<jishan2.length; j++){
				 
				if ((jishan2[i]+jishan2[j] == 20)){
					
					System.out.print(" [");
					System.out.print(jishan2[i]+","+jishan2[j]);
					System.out.print("], ");
				
					
				} 
				else{
					
				}
				
				
				
			}
		}
		System.out.print("}");
		
		/*	
			for(int i = 1; i<=10; i++) {
	            for(int j = 1; j<= i; j++) {
	                System.out.print("* "+j);
	            }
			 System.out.println();
			}
	
		
			
			int e =1;
			while (e<=10){
				System.out.println(e);
				e++;
			}
			
			int g=20;
			do {
				System.out.println(g);
				g--;
			}
			while(g>10);
			
			*/
			
			
			
			
		}
}


