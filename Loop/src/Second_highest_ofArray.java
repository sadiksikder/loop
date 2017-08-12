import java.util.Random;
//generate 10 random no. and findout 2nd highest. 

	/**generate in one loop a 1st highest no. and then in 2nd loop findout comparing 1st highest no define 2nd
	 * highest no.*/

/**if two no. is identical how to auto regenerate loop?*/

public class Second_highest_ofArray {

	public static void main(String[] args) {
		int firstLarg, secondLarg, thirdLarg, mini;
		int i;
		int lowest;
		int secmini;
		
		int num[]= new int[10];
		Random ran = new Random();
		
		// first highest
		System.out.print(" Random nos.: - ");
		for (i = 0; i < 9; i++) {

			num[i] = ran.nextInt(10);
			System.out.print(+num[i] + "  ");
		}
		
		secmini =firstLarg= num[0];
		mini= num[0];
		
		thirdLarg= num[0];
		
		for (i = 0; i < 9; i++) {
			if (firstLarg < num[i]) {
				firstLarg = num[i];
				
			}
		}
		System.out.println("\n highest: "+firstLarg+"  ");
		
		
		//minimum 
		for (i = 0; i < 9; i++) {
			if (firstLarg>num[i]&& mini>num[i]) {
				mini = num[i];	

			}

		}
		System.out.println(" minimum : "+mini+"  ;");
		
		secondLarg=mini;
		for(i=0;i<9;i++){
			if(firstLarg>num[i] && secondLarg<=num[i]){
				secondLarg=num[i];
			}
		}
		System.out.print("2nd largest: "+secondLarg);
		
		secmini=firstLarg;
		for(i=0;i<9;i++){
			if(secmini>num[i] && mini>=num[i]){
				secmini=num[i];
			}
		}
		System.out.print("2nd lowest: "+secmini);
		
		//3nd Highest
				/*for(i=0;i<9;i++){
					if(secondLarg > num[i]&& thirdLarg<=num[i]  ){
						thirdLarg = num[i];
					}
					if(secondLarg== thirdLarg){
						return;
					}
				}
				
				
				System.out.println(" 3nd highest: "+thirdLarg+"  ");
				*/
		//to find lowest
		/*for(i=0;i<9;i++){
			if(firstLarg > num[i]&& secondLarg>=num[i] ){
				secondLarg = num[i];
			}
		}
		System.out.println(" lowest: "+secondLarg+"  ");
		
		*/
	
	
	}

}
