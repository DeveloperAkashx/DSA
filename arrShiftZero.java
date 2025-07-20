package DSA;

public class arrShiftZero {

	public static void main(String[] args) {

		int arr[] = {0,2,5,0,4,0,9,8};
		
		int nonZeroIndex = 0;
		 
		for(int i=0; i<arr.length; i++) {
			if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
		}
		
		while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
		
		for (int num : arr) {
            System.out.print(num + " ");
        }
		
		// Swap the arr index to last index
		

	}

}
