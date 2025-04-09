public class Prob07 {
    public static void main(String[] args) {
        int arr[]  = {2,4,6,8,10};
        subArrays(arr);
    }
    public static void subArrays (int arr[]){
        int sum=0;
        int ts =0;
        for(int i =0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                   
                    System.out.print( arr[k] + " ");

                    sum = sum+arr[k];
                }

                System.out.println(" Sum of maximum pair "+ sum);
                sum = 0;
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total sub arrays "+ts);
    }
}
