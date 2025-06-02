public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        countEvenOdd(arr);
    }
    public static void countEvenOdd (int arr[]){
        int even = 0 , odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even Count: "+even);
        System.out.println("Odd Count: "+odd);
    }
}
