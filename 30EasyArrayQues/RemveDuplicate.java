public class RemveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,5,5,6,7,8,8,9};
        removeDuplicates(arr);
        
    }
    public static void  removeDuplicates(int arr[]) {
        int j=0;
        for( int i=0; i<arr.length; i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
         j = j+1;
        for(int i=0; i<j; i++){
            System.out.print(arr[i] + " ");
        }
    }

}