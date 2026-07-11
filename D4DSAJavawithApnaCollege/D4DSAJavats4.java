public class D4DSAJavats4 {
    public static void InsertionSortEx(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print("," );
            }
        }
        System.out.print("]");
    }

    public static void main(String args[])
    {
        int arr[] = {5,3,4,1,2,0};
        InsertionSortEx(arr);
    }

}