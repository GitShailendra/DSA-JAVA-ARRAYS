
public class MaxNum {
    public static void main(String[] args) {
        int arr [] = {4,2,0,6,3,2,5,12};
        System.out.println(findMax(arr));

    }
    public static int findMax(int [] arr){
        if(arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
   
}
