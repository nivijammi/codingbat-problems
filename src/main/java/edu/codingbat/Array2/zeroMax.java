package edu.codingbat;

public class zeroMax {
    /*
    Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
     */
    public int[] zeroMax(int[] nums) {
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] == 0)
            {
                int maxindex = i;
                for (int j=i+1; j<nums.length; j++)
                {
                    if ((nums[j]%2 == 1) && (nums[j] > nums[maxindex]))
                    {
                        maxindex = j;
                    }
                }
                nums[i] = nums[maxindex];
            }
        }
        return nums;
    }

    public static void main(String[] args){
        zeroMax object = new zeroMax();
        int[] nums = {0,1,5};
        object.zeroMax(nums);
    }
}


