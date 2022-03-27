package edu.codingbat.Array2;

public class sum67 {

    public int sum67Method(int[] nums){
        int sum=0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 6) {
                while(i < nums.length && nums[i] != 7 ) {
                    i++;
                }
            }
            else {
                sum = sum + nums[i];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public int sum67Method2(int[] nums){
        int sum=0;
        boolean stopSumming = false;

        for(int i=0; i < nums.length; i++) {

            //turn stopSumming on when num[i]==6
            if(nums[i]==6) {
                stopSumming = true;
            }

            if(stopSumming && nums[i]!=7){
                System.out.println("numbers excluded: "+ nums[i]);

            }

            //turn stopSumming off when 7 is seen after 6
            if(stopSumming && nums[i]==7 ){
                stopSumming=false;
                continue;   //"continue" in Java means go to end of the current loop, means: if the compiler sees continue in a loop it will go to the next iteration
            }

            if(!stopSumming){
                sum = sum + nums[i];
            }
        }
        System.out.println("Solution :"+ sum);
        return sum;
    }


    public static void main(String[] args){
        sum67 object = new sum67();
        int[] nums={1,2,2,6,99,99,7,3,4,5};
        //object.sum67Method(nums);
        object.sum67Method2(nums);
    }
}
