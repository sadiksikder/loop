import java.util.Random;


public class test {
	static int i, firstlarg, lowest,secendhigh,secondmini;

	public static void main(String[] args) {
		int num[] = new int[20];
		Random rn = new Random(); // giving nos in braces results error 
		System.out.println("generated nos:");
		for(i=0;i<19;i++){
			num[i]= rn.nextInt(50);
			System.out.print(num[i]+" ");
		}
		firstlarg = num[0];
		for(i=0;i<19;i++){
		if(firstlarg<num[i]) {
			firstlarg=num[i];
		}
		
		}
		System.out.println("\nfirstlarg:" +firstlarg);
		
		lowest = num[0];
		for(i=0;i<19;i++){
			if(lowest>num[i])lowest=num[i];
		}
		System.out.println("lowest:" +lowest);
		
		for(i=0;i<19;i++){
			if(firstlarg>num[i] && lowest<num[i]){
				secendhigh=lowest=num[i];
				
		}
		}
		System.out.println("second highest:"+secendhigh);
		
	
	}
	

}
