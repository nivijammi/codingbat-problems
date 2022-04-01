package edu.codingbat.array2;

public class post4 {
    /*
    * Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/
    public int[] post4Method(int[] nums) {
        int length = nums.length-1;
        int indexOf4 = 0;

        for (int i = 0;i<=length;i++) {

            if(nums[i]==4){
                indexOf4 =i;

            }

        }
        System.out.println("indexOf4 is :"+ indexOf4);

        int[] arr = new int[length-indexOf4];
        for (int i =0; i<=arr.length-1 ; i++) {

            arr[i] =nums[indexOf4+1+i]; //substring after index 4



        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + ",");

        }
        return arr;
    }
    public static void main(String[] args){
        post4 object = new post4();
        int[] nums = {4,4,1,2,3};
        object.post4Method(nums);

    }

}
