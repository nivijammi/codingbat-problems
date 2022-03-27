package edu.codingbat.string3;

public class SameEnds3 {
    public boolean sameEnds(int[] nums, int len) {
        for(int i=0;i<len;i++) {
            System.out.println(nums[i]);
            if(nums[i] != nums[nums.length - len + i]){
                System.out.println("true");
                return false;
            }

        }
        System.out.println("true");
        return true;
    }
    public static void main(String[] args){
        SameEnds3 object = new SameEnds3();
        int[] nums ={5,6,45,99,13,5,6};
        object.sameEnds(nums,2);
    }
}
