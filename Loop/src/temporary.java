import java.util.Random;

public class temporary {
	private static int rn, i;

	public static void main(String[] args) {

		int num[] = new int[3];

		Random ran = new Random();
		rn = ran.nextInt(10);
		try {
			for (i = 0; i < 3; i++) {
				num[i] = ran.nextInt(10);
				System.out.print(num[i] + " ");
			}

		} catch (Exception e) {

		}
		
		if(num[0]>=num[1] ){
			System.out.println("middle no:"+ num[0]);
		}
		/*else if (num[0]<num[2] && num[1]<=num[2]){
			System.out.println("middle no:"+ num[2]);
		}*/

	}

}
