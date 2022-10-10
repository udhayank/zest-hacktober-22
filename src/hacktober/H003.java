package hacktober;

public class H003 {

	public static void main(String[] args) {
		
		System.out.println(new H003().reverse(1234));

	}
	
	public int reverse(int num) {		
		int res = 0;
		while (num > 0) {
			res = res * 10 + (num%10);
			num /= 10;
		}
		return res;		
	}

}
