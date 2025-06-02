public class FindMaxProduct {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1};
        System.out.println("Max product of two elements is: "+findMaxProd(arr));
    }
    public static int findMaxProd(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]*arr[j]>max){
                    max = arr[i]*arr[j];
                }
            }
        }
        return max;
    }
}
