package edu.codingbat.Array3;

public class CountClumps {
    public int countClumps(int[] nums){
        boolean match = false;
        int sum =0;
        for(int i =0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1] && !match) {
                match = true;
                sum++;
            }
            else if(nums[i] != nums[i+1]){
                match = false;
            }


        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        CountClumps object = new CountClumps();
        int [] nums = {1,1,1,1,1};
        object.countClumps(nums);
    }
}
