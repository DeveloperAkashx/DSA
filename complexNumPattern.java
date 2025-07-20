package DSA;

public class complexNumPattern {

	public static void main(String[] args) {
		
		// 0 2 3
		// 4 6 6
		
		int count = 1;
		
		for(int i=1; i<3; i++) {
			for(int j=1; j<=3; j++) {
				if(i==j) {
					System.out.print((i*i*i)-i);
					count++;
				}
				else {
					System.out.print(+count);
					count++;
				}
			}
			System.out.println();
		}
		
		
		
		

	}

}
