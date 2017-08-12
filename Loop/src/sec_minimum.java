
import java.util.Random;

/**findout the 2nd lowest no.*/
public class sec_minimum {

	public static void main(String[] args) {
		
		int firstLarg, secondLarg, thirdLarg, secmini,seclowest;
		int i;
		int lowest;
		
		int num[]= new int[10];
		Random ran = new Random();
		System.out.print("generated nos: ");
		for(i=0;i<10;i++){
			num[i]=ran.nextInt(10);
		
			System.out.print(num[i]+" ");
		}
		
		firstLarg=num[0];
		lowest = num[0];
		seclowest=num[0];
		
		//find out highest no.
		for(i=0;i<9;i++){
			if(firstLarg<num[i]) firstLarg = num[i] ;
		}
		System.out.println("\nhighest no.- "+firstLarg);
		
		// finding second highest
		for (int s : num) {
			if (firstLarg > s && lowest < s) {
				lowest = s;
			}
		}
		// firstLarg=secmini=num[0];
		System.out.println("2nd highest: " +lowest);
		
		//findout lowest no.
		for(i=0;i<9;i++){
			if(lowest>num[i]) lowest= num[i];
		}
		System.out.println("lowest: " +lowest);
		for(int s:num){
			if(firstLarg>s && lowest<s) 	firstLarg=s;
			
		}
		System.out.println("second lowest: "+firstLarg);
		
		//finding second highest
		for (int s : num) {
			if (firstLarg > s && lowest < s) {
				seclowest = s;
			}
		}
		
		//for loop usage
		System.out.print("special foor loop: ");
		for (int s : num) {
			System.out.print(+s + " ");
		}
		
	}

}
