public class ArrayMinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int min = arr[4];
        int max = 0;
        for(int i=0;i<arr.length; i++){
            if(min<arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }

            System.out.println("Max value : "+max);
            System.out.println("Min value : "+min);
        }
    }
}
