// Palindrome = string remains same when it reversed 

public class strCheckPalindrome {
    public static void main(String[] args) {
        
        String my = "madam";

        String reversed = new StringBuilder(my).reverse().toString();

        System.out.println(reversed);


        // String str = "akash";
        // String reversed = "";

        // for(int i=str.length()-1; i>=0; i--){
        //     reversed += str.charAt(i);
        // }

        // System.out.println(reversed);

        if (my.equals(reversed)) {
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
