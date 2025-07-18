public class strSubString {
    public static void main(String[] args) {
        String str = "My name is Akash";

        System.out.println("The string lengh is: " + str.length());

        System.out.println("SubString : " + str.substring(0,7));

        // Reverse subString "Akash"

        System.out.println(str.substring(11,16));

        str = str.substring(11,16);

        System.out.println(str);

        for(int i= str.length() -1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println("");

        // Now with StringBuilder

        String reversedString = new StringBuilder(str).reverse().toString();

        System.out.println(reversedString);

    }
}
