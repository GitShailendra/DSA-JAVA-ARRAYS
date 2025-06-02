public class UniqueElements {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(hasUniqueElem(arr));
    }
    public static boolean hasUniqueElem(int [] arr){
        int count = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
}
