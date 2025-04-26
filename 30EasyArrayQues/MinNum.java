import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        // int arr[] = {4,2,0,6,3,2,5};
        // System.out.println(findMin(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // public static int findMin(int arr[]){
    //     if(arr.length == 0){
    //         return -1; // or throw an exception
    //     }
    //     if(arr.length == 1){
    //         return arr[0];
    //     }
    //    int min = Integer.MAX_VALUE;
    //    for(int i=0; i<arr.length; i++){
    //     if(arr[i]<min){
    //         min = arr[i];
    //     }
    //    }
    //      return min;
    // }
}
