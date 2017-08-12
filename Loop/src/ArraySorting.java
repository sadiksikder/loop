import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class ArraySorting {

	public static void main(String[] args) {
		
		int firstLarg, secondLarg, thirdLarg;
		int i;
		int lowest;
		
		int[] num= new int[10];
		Random ran = new Random();
		
		//first highest
		System.out.print(" Random nos.: - ");
		for(i = 0; i<9;i++){
			
			num[i]= ran.nextInt(100);
			System.out.print(+num[i]+"  ");
		}
		
	Arrays.sort(num);
	for(i = 0; i<10;i++){
		System.out.println("sorted: "+num[i]+" ");
	}
	}
	

}
