

public class strCheckEquality {
    public static void main(String[] args) {
        String str = "Akash Patil";
        String str2 = "akash patil";

        str = str.toLowerCase();

        if(str.equals(str2)){
            System.out.println("Both String are equal");
        }
        else{
            System.out.println("Not Equal");
        }

    }
}
