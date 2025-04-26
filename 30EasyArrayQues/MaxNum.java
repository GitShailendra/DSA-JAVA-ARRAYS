
public class MaxNum {
    public static void main(String[] args) {
        int arr [] = {4,2,0,6,3,2,5};
        System.out.println(findMax(arr));

    }
    public static int findMax (int arr[]){
        if(arr.length == 0){
            return -1; // or throw an exception
        }
        if(arr.length == 1){
            return arr[0];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
