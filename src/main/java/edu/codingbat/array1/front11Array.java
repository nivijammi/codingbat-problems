package edu.codingbat.array1;

public class front11Array {
    /* Given 2 int arrays, a and b, of any length, return a new array with the first         element of each array. If either array is length 0, ignore that array.
    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    front11([1], [2]) → [1, 2]
    front11([1, 7], []) → [1]
    */
    public int[] front11(int[] a, int[] b) {
        int lengthA = a.length;
        int lengthB = b.length;
        int [] c;

        if(lengthA==0 && lengthB==0){
            c = new int[0];

            return c;
        }
        if(lengthA==0){
            c = new int[1];
            c[0]= b[0];

            return c;
        }
        if(lengthB ==0){
            c = new int[1];
            c[0]=a[0];

            return c;
        }
        else{
            c = new int[2];
            c[0]= a[0];
            c[1]= b[0];

            return c;
        }
   }
    public static void main(String[]args){
        front11Array object = new front11Array();
        int[] a= {1,2,3}; int[] b = {7,8,9};
        int[] a1= {3}; int[] b1 = {1,4,1,9};
        int[] a2= {1,4,1,9}; int[] b2 = {};
        int[] a3= {}; int[]b3 ={};
        int[] c = object.front11(a3,b3);
        if(c.length>0) {
            for(int i=0; i<c.length;i++)
            System.out.println(c[i]);
        }
    }

}
