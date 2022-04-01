package edu.codingbat.array2;

public class sum28 {
    /*
    * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


    sum28([2, 3, 2, 2, 4, 2]) → true
    sum28([2, 3, 2, 2, 4, 2, 2]) → false
    sum28([1, 2, 3, 4]) → false
    */
    public boolean sum28Method(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==2){
                sum=sum+2;
                System.out.println(sum);

            }

        }
        if(sum==8){
            System.out.println("true");
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        sum28 object = new sum28();
        int[] nums = {2,3,2,2,4,2,2};
        object.sum28Method(nums);
    }

}
