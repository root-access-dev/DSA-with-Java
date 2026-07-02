public class D2DSAJavats5 {
    public static void printPairs(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.println("(" + current + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair : " + tp);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        printPairs(number);
    }
}
