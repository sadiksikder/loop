import java.util.Scanner;


public class Loop_Incre_decre_test {
	static int c ;
	static int d ;
	static int e ;
	static int f ;
	static int g ;
	public static void main(String[] args) {
		
/**for loop testing */		
/*for (e = 5;;e+=100){
	
	//System.out.println(e);
	if(e>=100 && e<=500) {
	System.out.println(e);
	}
	if(e>=1000)break;
	//if(e>=1000) break;
}*/

/**increment decrement test*/		
/*c= 5;
System.out.println(c++);//5
System.out.println(c);//6
System.out.println(++c);//7
System.out.println(c);//7
System.out.println(c+=5);//12
System.out.println(--c);//11
System.out.println(c-=11);//0
*/
		
/**while performence test*/
		/*int product=3;
		while ( product <= 100 ){
			//System.out.println(product);
			product = 3 * product;
			if(product<100)continue;//243<100 //need to discuss
			
			System.out.println(product);
		}
	*/

int total = 0;
int grade = 1;
Scanner input = new Scanner(System.in);
 while (grade<=10){
	 System.out.println("enter grade");
	 grade = input.nextInt();
	 total = total +grade;
	 grade++;
	 
	 
 }

		

	

		

	}

}
