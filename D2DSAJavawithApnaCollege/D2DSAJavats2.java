public class D2DSAJavats2 {

    public static void printLargestAndSmallest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Using the enhanced for-loop correctly: 'num' is the actual element value
        for (int num : number) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Smallest Number : " + smallest);
        System.out.println("Largest Number : " + largest);
    }

    public static void main(String args[]) {
        int number[] = {1, 2, 6, 3, 5};
        printLargestAndSmallest(number);
    }
}