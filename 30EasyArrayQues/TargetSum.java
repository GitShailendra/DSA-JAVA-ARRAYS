public class TargetSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        int output[] = new int[2];
        targetSum(arr, target,output);
        if(output[0] == 0 && output[1] == 0){
            System.out.println("No such pair found");
            return;
        }
        for(int i=0; i<output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
    public static void targetSum (int arr[], int target,int output[]){
        if(arr.length < 2){
            System.out.println("Array must have at least two elements");
            return;
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    output[0] = arr[i];
                    output[1] = arr[j];
                    System.out.println("index found at " + i + " and " + j);
                    return; 
                    
                }
            }
        }
        
    }
}