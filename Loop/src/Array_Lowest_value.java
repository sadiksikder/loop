import java.util.Random;


public class Array_Lowest_value {
	

	public static void main(String[] args) {
		int add[]=new int[10];
		int lowest = Integer.MAX_VALUE;
		int lowest1 = Integer.MAX_VALUE;
		Random a = new Random();
		for(int i=0;i<10;i++){
			
			add[i]=a.nextInt(100);
			System.out.print(add[i]+" ");
		
		if(add[i]<lowest){
			lowest=add[i];
			
		}
		}
		System.out.print("lowest: "+lowest);
		System.out.println();
		
			for(int i=9;i>=0;i--){
			
			add[i]=a.nextInt(100);
			System.out.print(add[i]+" ");
		
		if(add[i]<lowest1){
			lowest1=add[i];
			
		}
		}
		System.out.print("lowest: "+lowest1);
		System.out.println();
		
		double avg=(lowest+lowest1)/2;
		System.out.println("average: "+avg);
		
		

	}

}
