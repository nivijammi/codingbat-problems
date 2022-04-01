package edu.codingbat.ap1;
/*
Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.


mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]

 */

import java.util.Arrays;

public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        int aIndex =0;
        int bIndex =0;
        String [] array = new String[n];


        for(int i =0; i<n; i++){
            int compare = a[aIndex].compareTo(b[bIndex]);
            if(compare<=0){ // to avoid duplicate in new array, we add the a[index] nce and jump to next index.
                array[i]= a[aIndex];
                aIndex++;
            }
            if(compare>0){
                array[i]= b[bIndex];
                bIndex++;
            }
            if(compare==0){

                bIndex++;// already inseted a[index] in array, so to avoid duplicate we jump to next index
            }

        }


        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        MergeTwo object = new MergeTwo();
        String[] a= {"f", "g", "z"};
        String[] b = {"c", "f", "g"};
        int n = 3;
        object. mergeTwo(a,b,n);
    }
}
