public class MOveZeroes2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,4,5,0,3,0,6};
        moveZeroes(arr);
        //two pointer approach
    }
    public static void moveZeroes(int arr[]){
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
