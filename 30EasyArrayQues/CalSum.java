
public class CalSum {
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Sum of the array is: " + calSum(arr));
    }
    public static int calSum (int arr[]) {
        if(arr.length == 0) {
            return -1; // or throw an exception
        }
        if(arr.length == 1) {
            return arr[0];
        }
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}
