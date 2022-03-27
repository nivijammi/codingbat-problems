package edu.codingbat;

public class TripleUp {
    /*
    * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.


    tripleUp([1, 4, 5, 6, 2]) → true
    tripleUp([1, 2, 3]) → true
    tripleUp([1, 2, 4]) → false
    */
    public boolean tripleUp(int[] nums) {
        int diff2n1 =0;
        int diff3n2 =0;
        for(int i=2;i<nums.length;i++){
            diff2n1= nums[i-1]-nums[i-2];
            diff3n2= nums[i]-nums[i-1];
            if(i<nums.length && diff2n1==1 && diff3n2 ==1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        TripleUp object = new TripleUp();
        int[] nums = {1,4,5,6,2};
        object.tripleUp(nums);
    }
}
