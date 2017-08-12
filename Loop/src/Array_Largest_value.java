import java.util.Random;


public class Array_Largest_value {
	static int i;
	static int lowest;
	public static void main(String[] args) {
		  int largest = Integer.MIN_VALUE;
		  int largest1 = Integer.MIN_VALUE;//to calculate largest value
		  int largest2=Integer.MAX_VALUE;//to calculate lowest value
		  int addition=0;
		  double avg=0;
		int add[]= new int[10];int sum[]=new int[10];
		//System.out.println(add.length);
		
		Random r = new Random();
		for( i = 0; i<10;i++){
			add[i] = r.nextInt(10);
			//addition= addition+add[i];
			 
			 //if(add[0])
			System.out.print(add[i]+" ");
			 /* if(add[i]<=add[i]){
				  System.out.println("largest: "+add[i]);
			  }*/
			/*if(add[i]>largest){
				largest=add[i];
			}
			if(add[i]<largest2){
				largest2=add[i];
			}*/
			
		}
		largest = add[0];
		lowest= add[0];
		for(i=0;i<10;i++){
			if(largest<add[i]){
				largest=add[i];
				
			}
			if(lowest>add[i]){
				lowest = add[i];
			}
			addition= addition+add[i];
		}
		avg = (double)addition/10;
		System.out.print("largest: "+largest+" ");
		System.out.print("lowest: "+lowest+" ");
		System.out.print("average: "+avg);
		/*avg = (double)addition/10;
		System.out.print("largest:"+largest+" ");
		System.out.print("lowest: "+largest2+" ");
		System.out.println("average: "+avg);*/
		
		
		/*System.out.println();
		for(int i=9;i>=0;i--){
			add[i]=r.nextInt(10);
			System.out.print(add[i]+ " ");
			if(add[i]>largest1){
				largest1=add[i];
			}
		}
		System.out.println("largest: "+largest1);
		System.out.println();*/
		/*for(int k=0;k<10;k++){
			sum[k]=add[k]+add[9-k];
			System.out.print(sum[k]+" ");
		}*/
		
	}

}
