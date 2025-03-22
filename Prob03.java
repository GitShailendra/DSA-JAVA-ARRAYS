public class Prob03 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println("Largest number in the array is: "+largestNumber(arr));
    }
    public static int largestNumber (int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
