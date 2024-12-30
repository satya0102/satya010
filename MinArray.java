public class MinArray {
    public int findMinimum(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("invalid input");

        }
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];

            }
        }
        return min;


    }
    public static void main(String[] args){
        int[] arr ={5,8,9,10,1,2};
        MinArray ma =new MinArray();
        System.out.println(ma.findMinimum(arr));

    }
}
