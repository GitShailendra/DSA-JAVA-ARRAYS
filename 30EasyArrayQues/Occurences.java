
public class Occurences {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        int num = 2;
        System.out.println("Number of occurrences of " + num + " is: " + countOccurrences(arr, num));
    }
    public static int countOccurrences (int arr[], int num){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }    
}
