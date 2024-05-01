public class MaxRangeValueArray {
    public static void main(String[] args){
        int[] arr = {};
        System.out.println(maxrange(arr,0,1));
    }
    static int maxrange(int[] arr,int start,int end){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[start];
        for(int i = start;i < end;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
