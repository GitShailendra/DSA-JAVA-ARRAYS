
public class CheckExist {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int num = 8;
        System.out.println("Does the number " + num + " exist in the array? " + checkExisst(arr, num));
    }
    public static boolean checkExisst(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

}
