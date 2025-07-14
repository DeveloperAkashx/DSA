// Anagram = same character, same lengh, in differrent order

import java.util.Arrays;

public class strCheckAnagram {
    public static void main(String[] args) {
        String str1 = "Akash";
        String str2 = "Hsaka";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        
    }
}
