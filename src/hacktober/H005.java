package hacktober;

public class H005 {

	public static void main(String[] args) {
		
		System.out.println(new H005().isValidTriangle(70, 60, 60));

	}
	
	public boolean isValidTriangle(int a, int b, int c) {
		return a+b+c == 180 ? true : false;
	}

}
