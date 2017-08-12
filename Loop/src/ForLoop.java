import java.util.Random;
import java.util.Scanner;


public class ForLoop {
	
	public static void main(String[] args) {
		
		//run a for loop , get 1 to 10 of square which is dividable by 4 and greater than of.  print out that no.?

		/*Scanner myScanner = new Scanner(System.in);
		System.out.println("input your no");
		myScanner.nextLine();*/
		//System.out.println("\t***print out those no. which are greater than 4 and dividable by 4***");
	/*	for(int i=0  ; i <=10; i++){
			
			int multi = i*i;
			
			//System.out.print( "-for loop: " +i*i +" % 4 = " );
			
			if (multi >4 && multi%4 == 0) System.out.println(i +" th square and divideable " +multi);
			//else if (multi%4 !=0);
*/			
			
		Random rand = new Random();
		int value;
		//break;continue;
		/*for(int i=0  ; i <10; i++){
			
			value = rand.nextInt(100) + 1;
			System.out.println(value);
			
			
			if(value > 50)
				continue;
			
			if(value >= 1 && value <= 20) System.out.println("value between 10 & 20");
			else if (value >= 20 && value <= 40) System.out.println("value between 20 & 40");
			else if (value >= 41 && value <= 60)System.out.println("value between 41 & 60");
			else if (value >=61 && value<= 80) System.out.println("value between 61 && 80");
			else if (value >= 81 && value<= 100) System.out.println("value between 80 && 100");
		}*/
		
		/*for(int i= 0; ; i++){
			if(i >=100 ) break;
			
			if (i < 20)continue;
			
			if ( i%2 !=0) System.out.println("print : " +i);
		}*/
		
		/*for(int i = 0; i < 5; i++){
			System.out.println("For i = "+i);
			for(int k = 0; k <5 ;k++){
				if(k>2) break;
				System.out.print(k+" ");
			}
			System.out.println();
		}*/
		
		/*Random prime = new Random();
		int i = prime.nextInt(100);
		System.out.println(i);
		int l=1;
		if(i % 2==1 )*/
		
		for(int i = 0 ; i < 3; i++){
			if(i>7) System.out.println("i = "+i);
			for(int k = 0; k < 4;k++){
				
				if(i %2 ==0) break;
				if(i%3==0) continue;
				
				if(k>2) System.out.println("k is grater then 2");
				else if(k%3 ==1) System.out.println("k is not divide by 3");
				else System.out.println("k is "+k);
			}
			System.out.println();
		}
		
		
	}
	

}
