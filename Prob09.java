public class Prob09 {
    public static void main(String[] args) {
        int [] arr = {-1,-2,-3,-4,-5,8,-7};
        maxSubArrayKadanes(arr);
    }
    public static void maxSubArrayKadanes (int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            
            
            if(currSum<0){
                currSum = 0;
            }
            if(currSum>maxSum){
                maxSum = currSum;
            }

            if(i==(arr.length-1)&& currSum==0){
                System.out.println("the array you gave is negative at least give one positive value in array");
                return;
            }
                
        }
        System.out.println(maxSum);
    }
}
