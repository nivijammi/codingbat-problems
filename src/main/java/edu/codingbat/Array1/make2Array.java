package edu.codingbat.Array1;

public class make2Array {
    /*
    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.


    make2([4, 5], [1, 2, 3]) → [4, 5]
    make2([4], [1, 2, 3]) → [4, 1]
    make2([], [1, 2]) → [1, 2]
    */
    public int[] make2(int[] a, int[] b) {
        int[]newArray = new int[2];
        int index = 0;
        for (int i =0; i<a.length; i++){
            if(index<2){
                newArray[index]=a[i];
                index++;
            }
        }
        for (int i=0; i<b.length; i++){
            if(index<2){
                newArray[index]=b[i];
                index++;
            }

        }
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);

        return newArray;
    }


    public static void main(String[] args) {
        make2Array object = new make2Array();
        int[] a = {5};
        int[] b = {1, 2, 3,7,8,9};
        object.make2(a, b);

    }
}
