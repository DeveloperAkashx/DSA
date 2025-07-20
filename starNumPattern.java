package DSA;

public class starNumPattern {

	public static void main(String[] args) {
		
		// * 1 *
		// * 4 *
		
//		System.out.println("* 1 *");
//       System.out.println("* 4 *");
        
        int[] numbers = {1, 4};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" ");
            
            for (int j = 0; j < 4; j++) {
                if (j == 0 || j == 3) {
                    System.out.print(" *");
                } else if (j == 1) {
                    System.out.print(" ");
                } else if (j == 2) {
                    System.out.print(numbers[i]);
                }
            }
            System.out.println();
        }
		
	}

}
