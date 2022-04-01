package edu.codingbat.array2;

public class TenRun {
    /*
        * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
    */
    public int[] tenRunMethod(int[] nums){

        int tenVal=0;
        boolean tenFound =false;

        for(int i=0;i<nums.length; i++){

            if(nums[i]%10==0){
                tenFound = true;
                tenVal=nums[i];


            }
            if(nums[i]%10!=0 && tenFound==true){
                nums[i]=tenVal;

            }

        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return nums;
    }


    public static void main(String[] args){
        TenRun object = new TenRun();
        int[] nums = {1,2,50,1};
        object.tenRunMethod(nums);
    }
}
