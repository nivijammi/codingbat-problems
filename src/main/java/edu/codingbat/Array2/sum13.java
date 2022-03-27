package edu.codingbat.Array2;

public class sum13 {
    /*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6
        * */
    public int sum13Method(int[] nums) {
        int sum = 0;

        if(nums.length == 0){
            return 0;
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]==13){
                i++;
            }
            else{
                sum = sum+nums[i];
            }
        }
        System.out.println(sum);
        return sum;

    }
    public static void main(String[]args){
        sum13 object= new sum13();
        int[]nums ={1,2,2,1};
        int[]nums2 = {1,1};
        int[]nums3 ={1,2,2,1,13};
        object.sum13Method(nums3);
    }
}
