public class Prob02 {
    public static int linearSearch(String arr[],String target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[] = {"idli","dosa","samosa"};
        String target = "sambar";
       if(linearSearch(arr, target)==-1){
           System.out.println("Element not found");
       }
       else{
           System.out.println("Element found at index: "+linearSearch(arr, target));
       }
    }
}
