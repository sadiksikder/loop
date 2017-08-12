import java.util.Random;
import java.util.Scanner;

public class Prime_Check {

	static int rest;
	static int i;
	static int j;
	static int counter ;
	static int fact = 1;
	static int k;

	public static void main(String[] args) {
		
		/*for (int p = 1; p < 101; p++) {

			for (rest = 2; rest < p; rest++) {
				if (p % rest == 0) {
					break;
				}
			}
			if (rest == p)
				System.out.print(p + " ");
		}
	}*/
		/*//Sum the odd integers between 1 and 99, using a for statement
		for (i = 0; i<7; i++){
		if(i%2!=0){
			System.out.println(i);
			rest = rest + i;
			}	
		}
		System.out.println(rest);*/
		//Sum the odd integers between 1 and 99, using a for statement
		/*for (i= 0; i<10;i++){
			if(i%2 == 0){
				System.out.print(i+ " ");
				rest = rest+i;
				
			}
			
		}
		System.out.print(rest );*/
	//write a code which print integer maximal 5 characters
	/*for(i=1; i<=20;i++){
		if(i%4==0) System.out.print("\n");
		System.out.print(i+ " ");
	}	*/
	
		/*counter = 2;
		
		do{
			System.out.print(counter+ " ");
			counter +=2;
		}while (counter<50);
		*/
		
		/**Printing symbols*/
		
		/*for(i=5; i>1; --i){
			for(j=1;j<i; ++j){
				System.out.print("@");
			}
			System.out.println("");
		}*/
		
	//Factorial Program in Java
		/*j= 6;
		for (i=1;i<=j;i++){
			fact = fact*i;
			System.out.print(i+ " ");
		}
		System.out.println("summation of factorial - "+fact);
		*/
		
		//The concept of generate Table of any number 
		
		/*for(i=1;i<11;i++){
		j= 10*i;	
		//System.out.print(i+ " ");
		System.out.print(j+" ");
		
		
		}*/
		
		/*Scanner myScanner = new Scanner(System.in);
		System.out.println("Input no.");
		i = myScanner.nextInt();
		
		for(j=1; j<=i; j++){
			//System.out.print(j+ " ");
			for(k=1; k<=i-(j-1); k+=2){
				System.out.print(k+ " ");
		
			}
		System.out.println();
		}*/
		//new lesson array
		int []sum = new int[10];
		Random rand =new Random();
		int []id = new int [10];
		for(i =0;i<10;i++){
			id[i]=rand.nextInt(10);
			
		}
		for(i =0;i<10;i++){
			System.out.print(id[i]+ " ");
			//if(id[i]%2==0) System.out.println("Even nos:- "+id[i]+ " ");
		}
		System.out.println();
		for(i=9; i>=0; i--){
			
			System.out.print(id[i]+ " ");
		}
		System.out.println();
		for(int k = 0; k<10; k++){
			//varibale[k+54+15415+l]
			sum[k] = id[k]+ id[9-k];

			
			System.out.print(sum[k]+ " ");
		}
		/*
		theory
		**********************************
		0 1 2 3 4 5 6 7 8 9
		9 8 7 6 5 4 3 2 1 0


		0 9 - 0
		1 8 - 1
		2 7 - 2
		3 6 - 3

		id[index] + id[9-index ]= sum[index]
		*******************************************************/
		
		//study in ARRAY; create n-th random no. of 100 and initialize with random no.
		//give information highest, lowest and total average no.
		
	}
		
}