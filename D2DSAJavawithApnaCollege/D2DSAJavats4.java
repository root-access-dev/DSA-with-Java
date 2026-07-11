public class D2DSAJavats4 {

    public static void Reversearrayex(int number[]) {
        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            // Correct Swap Logic
            int temp = number[start];
            number[start] = number[end]; // Move end value to the start
            number[end] = temp; // Move saved start value to the end

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        Reversearrayex(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " "); // Changed to print so it stays on one line
        }
        System.out.println();
    }
}