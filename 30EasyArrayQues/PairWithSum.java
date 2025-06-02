public class PairWithSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1};
        int sum = 6;
        printPairsSum(arr, sum);
    }   
    public static void printPairsSum(int arr[],int sum){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println("Pair Found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
