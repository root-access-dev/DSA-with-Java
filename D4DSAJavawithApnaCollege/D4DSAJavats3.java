public class D4DSAJavats3 {
    public static void SelectionsortEx(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }   

    public static void main(String args[]){
        int arr[]= { 151,5,1,51,5,1,51,6,1};
        SelectionsortEx(arr);
    }
}
