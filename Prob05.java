public class Prob05 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original array: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        revArray(numbers);  
        System.out.println("Reversed array: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void revArray (int [] numbers){
        int f = 0;
        int l = numbers.length - 1;
        while(f<l){
            int temp = numbers[l];
            numbers[l] = numbers[f];
            numbers[f] = temp;
            f++;
            l--;

        }
    }
}
