public class Prob10 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9, 10 };
        printDuplicate(arr);
    }

    public static void printDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }

        }
    }
}