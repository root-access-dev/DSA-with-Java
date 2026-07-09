public class D3DSAJavats2 {
    public static void Prefixsum(int number[]) {
        int currentsum = 0;
        int maxsum =Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
    for(int i=0;i<number.length;i++){
        int start = i;
        for(int j=i;j<number.length;j++){
            int end = j;
            currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            System.out.print(currentsum + "\t");
            if(maxsum < currentsum){
                maxsum = currentsum;
            }
        }
        System.out.println();
    }
    System.out.println("Max sum is : "+maxsum);

    }

    public static void main(String[] args) {
        int[] numbers = {1, -1, 2, 4, -3, 5, -2};
        Prefixsum(numbers);
    }
}