
public class CalAve {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8};
        System.out.println("Average of the array is: " + calAverage(arr));
    }
    public static int calAverage(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
