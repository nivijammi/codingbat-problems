package edu.codingbat;

public class matchUp {

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i=0; i<nums1.length; i++){
               int difference = Math.abs(nums1[i]- nums2[i]);
               if(difference > 0 && difference<=2 ){
                   count ++;
               }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args){
        matchUp object = new matchUp();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,3,5};
        object.matchUp(nums1,nums2);
    }

}
