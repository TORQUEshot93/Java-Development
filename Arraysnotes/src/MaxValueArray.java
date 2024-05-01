public class MaxValueArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,5,74,3,2,34};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
         int maxVal = arr[0];
         for(int i = 0;i < arr.length;i++){
             if(arr[i] > maxVal){
                 maxVal = arr[i];
             }
         }
         return maxVal;
    }
}
