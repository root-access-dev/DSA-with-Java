public class D4DSAJavats2 {

    public static void BubbleSortEx(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false; // Track if a swap happens in this turn
            
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true; // A swap occurred
                }
            } // <-- Added missing closing brace for the inner loop
            
            // This check must be OUTSIDE the inner loop, right after it finishes
            if (!swapped) {
                break;
            }
        } // <-- Added missing closing brace for the outer loop
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        BubbleSortEx(arr);
        
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}