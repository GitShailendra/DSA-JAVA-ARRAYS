
public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int num = 3;
        System.out.println("First occurrence of " + num + " is at index: " + firstOccurrence(arr, num));
    }
    public static int firstOccurrence ( int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1; // If the number is not found, return -1
    }
}
