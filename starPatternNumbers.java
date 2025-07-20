package DSA;

public class starPatternNumbers {

	public static void main(String[] args) {
			
//		1
//		  2
//		    3
		
		
		int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(i);
        }

	}

}
