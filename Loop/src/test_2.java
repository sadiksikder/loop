
public class test_2 {
	
	public static void main(String[] args) {
		
		        int[] numbers = {126,33,55,23,125,123};
		
		        int largest = Integer.MIN_VALUE;
	
		         
	
		        for(int i =0;i<numbers.length;i++) {
	
		            if(numbers[i] > largest) {
		
		                largest = numbers[i];
		
		            }
		
		        }
		
		         
		
		        System.out.println("Largest number in array is : " +largest);
		
		    }


}
