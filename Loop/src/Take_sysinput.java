
import java.util.Scanner;


public class Take_sysinput {
	
		
		private static String email = "dropboxbtest@gmail.com"; 
		private static String org;
	public static void main(String[] args) {
		System.out.println("Enter user input");
		Scanner scan = new Scanner(System.in);
		String sc = scan.nextLine();
		if(sc.isEmpty()){
		 org = email ;
			System.out.println(org);
			
			
		}
		else {
			org =sc;
			System.out.println("line 31 : "+org);
		

	}
	}
}
