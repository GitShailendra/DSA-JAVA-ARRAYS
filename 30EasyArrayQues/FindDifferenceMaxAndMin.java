public class FindDifferenceMaxAndMin {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,9};
        findDifference(arr);
    }
    public static void findDifference (int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        System.out.println("Difference between maximum and minimum element is: " + (max-min));
    }
}
