package codecademy;
/*
find the index and the element of common element in two arrays
*/

public class CommomElementInAnArray {
    public int commonElement(int[] arr1, int[] arr2){
        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.println("index :"+ j + "... " + "element:" + arr2[j]);
                }
            }
        }

        return 0;
    }
    public static void main(String[]args){
        CommomElementInAnArray object = new CommomElementInAnArray();

        int[] arr1 ={1001,1005,1010,1015,1020,1025,1030,1035,1040,1045};
        int [] arr2 = {1001,1002,1003,1004,1005,1006,1007,1008,1010,1011,1012,1013,1014,1015,1016,1017,1018,1019,1020};
        object.commonElement(arr1,arr2);

    }
}
