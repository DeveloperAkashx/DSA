// Reverse the substring but Output with orignal String like : My name is hsakA

public class strReverseSubString {
    public static void main(String[] args) {
        String str = "My name is Akash";

        String needed = str.substring(0, 10);

        String subString = str.substring(11, 16);

        String reversedString = new StringBuilder(subString).reverse().toString();

        System.out.println(reversedString);

        String result = needed + " " + reversedString;

        System.out.println(result);
    }
}
