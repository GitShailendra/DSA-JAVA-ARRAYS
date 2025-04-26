
public class SecSmallest {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        System.out.println("Second smallest element is: " + secondSmallest(arr));
    }
    public static int secondSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<secondSmallest && secondSmallest!=smallest && arr[i]!=smallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
