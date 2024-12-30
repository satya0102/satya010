public class maxsum {
   public static void maxsubarraysSum(int numbers[]){
       int currSum = 0;
       int maxSum = Integer.MIN_VALUE;
       
        for(int i =0; i<numbers.length; i++){
            int start =i;
            for(int j=0;j<numbers.length; j++){
            int end = j;
            currSum = 0;
            for(int k =start; k<=end; k++){
                currSum += numbers[i];
            }
            System.out.println(currSum);
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
    }
    System.out.println("maxSum = "+ maxSum);
   }
    public static void main(String [] args){
    int numbers[] = {2,4,5,7,8,9};

    maxsubarraysSum(numbers);


    }
} 
