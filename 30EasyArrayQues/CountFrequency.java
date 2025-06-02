public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 3,2, 2, 3, 3, 3, 4};
        countFrequency(arr);
    }
    public static void countFrequency(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 0){
                System.out.println(arr[i] + " : " + count);
                i += count - 1; 
            }
        }
    }
}
