public class D4DSAJavats5 {
    public static void CoutingSortEx(int arr[]){
        int larrget = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            larrget = Math.max(larrget,arr[i]);
        }
        int count[] = new int[larrget+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
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
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        CoutingSortEx(arr);
    }
}
