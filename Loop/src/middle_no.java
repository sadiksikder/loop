import java.util.Random;


public class middle_no {
		static int i;
		static int middle;
		static int lowest;
	public static void main(String[] args) {
		int avg=0;
		int add[]= new int[3];
		Random a = new Random();
		
		for(i=0;i<3;i++){
			add[i]=a.nextInt(10);
			System.out.print(" "+add[i]);
			
		}
		//System.out.println("\n"+add[1]);
		//middle= add[0];
		
		if(add[0] <= add[1] && add[0] >= add[2]){
			System.out.println("middle is "+add[0]);
		}else if(add[0] >= add[1] && add[0] <= add[2]){
			System.out.println("middle is "+add[0]);
		}
		else if(add[1]>=add[0] && add[1]<=add[2]){
			System.out.println(" "+"middle is add[1]"+ add[1]);
		}else if(add[1]<=add[0] && add[1]>=add[2]){
			System.out.println("middle is add[1]"+add[1]);
		}
		else System.out.println(add[2]);
		
	}
	

}
