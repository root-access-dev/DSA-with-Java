public class D2DSAJavats7 {
    public static void Subsuma(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int currentSum = 0;
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + (k == end ? "" : " , "));
                    currentSum += number[k];
                }
                System.out.println("] Sum = " + currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Subarray Sum = " + maxSum);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        Subsuma(number);
    }
}