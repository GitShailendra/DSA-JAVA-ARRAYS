public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
         
        findMissingNum(arr1);
    }
    public static void findMissingNum(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]!= i+1){
                System.out.println("Missing number is: " + (i+1));
                return;
            }
        }
    }
}
