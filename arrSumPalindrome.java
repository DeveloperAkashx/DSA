package DSA;

public class arrSumPalindrome {

	public static void main(String[] args) {
		
		// 1. for loop
		// 2. check number is Palindrome or not
		// 3. print sum of Palindrome numbers
		
		int arr[] = {2, 6, 1, 163, 153, 4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of palindrome numbers: " + sum);

	}
	
	public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

}
