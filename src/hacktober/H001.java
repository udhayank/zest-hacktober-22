package hacktober;

public class H001 {
	
	public static void main(String[] args) {
		
		System.out.println(new H001().findOccurance(4142434));
		
	}

	public int findOccurance(int num) {
		
		int count = 0;
		
		while (num!=0) {
			if (num % 10 == 4) {
				count++;
			}
			num /= 10;
		}
		
		return count;
	}
	
}
