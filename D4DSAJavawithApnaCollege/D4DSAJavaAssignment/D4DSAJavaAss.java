public class D4DSAJavaAss{
    public static void BubbleSortEx(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    public static void SelectionSortEx(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int minpos = turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[turn];
            arr[turn] = arr[minpos];
            arr[minpos] = temp;
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    public static void InsertionSortEx(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]<current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    public static void CountingSortEx(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]<0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = { 5,4,1,2,3};
        BubbleSortEx(arr);
        SelectionSortEx(arr);
        InsertionSortEx(arr);
        CountingSortEx(arr);
    }
}