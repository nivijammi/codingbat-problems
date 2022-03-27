package edu.codingbat.Array3;

public class fix3And4 {

    public int[] fix34(int[] nums) {
        for (int i=0; i<nums.length;i++){
            if(nums[i]==4){
                for (int j = 0; j<nums.length;j++){
                    if(nums[j]==3){
                        swap(nums, j+1,i);

                    }
                }
            }
        }
        print(nums);
        return nums;
    }

    public void swap(int[]array, int i, int j){
        int temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }

    public void print(int[]nums){
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i] + ",");
        }
    }

    public static void main(String[]args) {
        fix3And4 object = new fix3And4();
        int[] array = {1, 3, 1, 4, 4, 3, 1};
        object.fix34(array);

    }
}
