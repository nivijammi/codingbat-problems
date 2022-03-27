package edu.codingbat;

public class NotAlone {

    /*
    We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.


notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
     */

    public int[] notAlone(int[] nums, int val) {
        int max = 0;

        for(int i=1; i<nums.length-1;i++){
            if(nums[i]==val){
                if(nums[i-1]!=val|| nums[i+1]!=val){
                    max = Math.max(nums[i-1],nums[i+1]);
                    if(max!=2){
                        nums[i] = max;
                    }else{
                        nums[i]=nums[i];
                    }
                }
            }
        }


        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
        NotAlone object = new NotAlone();
        int[] nums = {3,4};
        object.notAlone(nums, 3);

    }
}

