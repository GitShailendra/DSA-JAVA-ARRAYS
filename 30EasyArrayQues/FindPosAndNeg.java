public class FindPosAndNeg {
    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, -4, 5};
        findPosAndNega(arr1);
        
    }
    public static void findPosAndNega(int[] arr1){
        int posCount = 0;
        int negCount = 0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>0){
                posCount++;
            }else{
                negCount++;
            }
        }
        System.out.println("Positive numbers: " + posCount);
        System.out.println("Negative numbers: " + negCount);

    }
}
