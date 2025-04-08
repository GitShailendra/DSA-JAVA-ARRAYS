public class Prob06 {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12};
        pairArraay(arr);
    }
    public static void pairArraay (int arr []){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}
