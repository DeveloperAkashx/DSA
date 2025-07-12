import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        String my = "Akash Patil";

        System.out.println("String is : " + my);

        my = my.toLowerCase();
        int count = 0;

        for (int i=0 ; i<my.length() ; i++){
            if (my.charAt(i) == 'a' || my.charAt(i) == 'e' || my.charAt(i) == 'o' || my.charAt(i) == 'i' || my.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println("Total Number of vowels in String is " + count);

    }
}
