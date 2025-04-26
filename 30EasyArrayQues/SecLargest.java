
public class SecLargest {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10,12};
        System.out.println("Second largest element is: " + findSecondLargest(arr));
    }
    public static int findSecondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondLargest && secondLargest!=largest && secondLargest<largest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
