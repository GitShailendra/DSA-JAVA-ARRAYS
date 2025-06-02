public class FindMaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1,1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxFrequency = findMaxFrequency(arr);
        System.out.println("Maximum frequency: " + maxFrequency);
    }
    public static int findMaxFrequency(int[] arr) {
        int maxFrequency = 0;
        int currentFrequency = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                currentFrequency++;
                
            }else{
                 maxFrequency = Math.max(maxFrequency, currentFrequency);
                    currentFrequency = 1;
            }

        }
        maxFrequency = Math.max(maxFrequency, currentFrequency);
        return maxFrequency;
}
}