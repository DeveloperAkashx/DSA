import java.util.*;

public class ArrayAddition {
    public static void main(String[] args) {
        System.out.println("Enter size for array: ");
        int size;
        Scanner sc =new Scanner(System.in);
        size = sc.nextInt();
        int arr [] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }
}
