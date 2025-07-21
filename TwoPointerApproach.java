
import java.util.Arrays;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int Fpos = 0;
        int Lpos = arr.length-1;

        while(Fpos<Lpos){
            int temp = arr[Fpos];
            arr[Fpos] = arr[Lpos];
            arr[Lpos] = temp;
            Fpos++;
            Lpos--;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
