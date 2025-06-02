public class SortArray {
    public static void main(String[] args) {
        int arr[] = {3,42,5,6,26,10,8,9,1,2};
        sortArray(arr);
    }
    public static void sortArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
