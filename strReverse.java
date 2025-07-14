public class strReverse {
    public static void main(String[] args) {
        String str = "akash";
        String reversed = "";

        for(int i=str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }

        System.out.println(reversed);


        // if (str.equals(reversed)) {
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

    }
}
