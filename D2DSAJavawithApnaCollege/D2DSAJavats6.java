public class D2DSAJavats6 {
    public static void PrintSuba(int number[]) {
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                System.out.print("[ ");
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.print("]");
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + total);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        PrintSuba(number);
    }
}
