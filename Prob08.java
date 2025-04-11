public class Prob08 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        subArrays(arr);
    }

    public static void subArrays(int arr[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                
                for (int k = i; k <= j; k++) {

                    currSum = currSum + arr[k];

                }
                System.out.println(currSum);
                if(max<currSum){
                    max= currSum;
                } 
                
            }
            System.out.println();
        }
        System.out.println("Max of  sub arrays is " + max);
    }
}
