package hacktober;

public class H002 {

	public static void main(String[] args) {
		
		System.out.println(new H002().findSum(4001));

	}
	
	public int findSum(int num) {
		
		int firstNum = num % 10;
		
		while(num >= 10) {
			num /= 10;
		}
		
		int lastNum = num;
		
		return firstNum + lastNum;
		
	}

}
