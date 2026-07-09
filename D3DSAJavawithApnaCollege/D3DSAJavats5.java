public class D3DSAJavats5 {
    public static void Prefixsum(int number[]){
        int prefixsum[] = new int[number.length];
        prefixsum[0] = number[0];
        for(int i= 1; i<number.length;i++){
            prefixsum[i] = prefixsum[i-1]+number[i];
        } 
        System.out.print("Prefix Array : ");
        System.out.print("[");
        for(int j= 0;j<prefixsum.length;j++){
            System.out.print(prefixsum[j]);
            if(j<prefixsum.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5};
        Prefixsum(number);
    }
}
