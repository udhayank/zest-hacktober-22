package hacktober;

public class H004 {

	public static void main(String[] args) {
				
		System.out.println(new H004().secondLargest(3,1,2));
		
	}
	
	private int secondLargest(int a, int b, int c) {
		
		return (a>b && a>c) ? 
						(b > c ? b : c) : 
						(b>a && b>c ? 
								(a > c ? a : c) : 
								(a > b ? a : b));
		
	}

}
