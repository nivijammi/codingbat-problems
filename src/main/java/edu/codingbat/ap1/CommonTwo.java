package edu.codingbat.ap1;
/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.


commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3

 */

public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        int count=0;
        String commonTwo = "";
        for(int i=0;i<a.length;i++){
            for(int j = 0; j<b.length; j++){
                if(!commonTwo.equals(a[i])) {//to check and avoid duplicates
                    int compare = a[i].compareTo(b[j]);
                    if (compare == 0) {
                        count++;
                        commonTwo=a[i];
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        CommonTwo object = new CommonTwo();
        String[]a = {"a", "c", "x"};
        String[]b = {"b", "c", "d", "x"};
        object.commonTwo(a,b);
    }
}
