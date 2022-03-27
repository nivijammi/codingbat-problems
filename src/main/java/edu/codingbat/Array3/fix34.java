package edu.codingbat.Array3;

public class fix34 {

	public int[] fix34(int[] nums) {
		int num1 = 3;
		int num2 = 4;
		boolean pairFound = false;

		for(int i=0; i<nums.length; i++) {

			if (nums[i] == num1) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] == num2) {
						//System.out.println("Found Ready to Swap " + nums[j]);
						swap(nums, i + 1, j);
						pairFound = true;
					}
					if (pairFound == true){
						i = i+2;
						break;
					}
					//System.out.println("Do Nothing..." + nums[j]);
				}

			} else if (nums[i] == num2) {
				if (nums[i] == num2) {
					for (int j = i; j < nums.length; j++) {
						if (nums[j] == num1) {
							//System.out.println("Found Ready to Swap " + nums[j]);
							swap(nums,  i, j+1);
							pairFound = true;
						}
						if (pairFound == true){
							i=j+2;
							break;
						}
					}

				}

			}
			pairFound = false;

			// do nothing... increment i
		}
		//System.out.println(nums);
		return nums;
	}

	public void swap(int []arr,int i,int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}


	public static void main(String[]args) {
		fix34 object = new fix34();
		//int[] arr = {1,3,1,4};
		//int[] arr = {1, 3, 1, 4, 4, 3, 1};
		          //{1, 3, 4, 1, 1, 3, 4}
		int[] arr = {3, 2, 3, 2, 4, 4};
		int i = 2;
		int j = 3;
		//object.swap(arr,i,j);
		object.fix34(arr);
		  	
	}
}
