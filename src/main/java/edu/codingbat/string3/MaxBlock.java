package edu.codingbat.string3;
/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


maxBlock("hoopla")	2
maxBlock("abbCCCddBBBxx")	3
maxBlock("")	0
maxBlock("xyz")	1
maxBlock("xxyz")	2
maxBlock("xyzz")	2
maxBlock("abbbcbbbxbbbx")	3
maxBlock("XXBBBbbxx")	3
maxBlock("XXBBBBbbxx")	4
maxBlock("XXBBBbbxxXXXX")	4
maxBlock("XX2222BBBbbXX2222")	4 */

public class MaxBlock {
    public int maxBlock(String str) {

        int CurrentCount =1;
        int LargestCount=0;

        for (int i =0;i<str.length()-1; i++){

            if(str.charAt(i)==str.charAt(i+1)){

                CurrentCount++;
                if(LargestCount<CurrentCount){
                    LargestCount=CurrentCount;
                }
            }
            else{

                CurrentCount =1;
            }
        }
        //edge case: where the str doesn't contain any block and when str is empty
        if(str.length()>1 && CurrentCount > LargestCount){
            LargestCount=CurrentCount;
        }

        System.out.println(LargestCount);
        return LargestCount;
    }

    public static void main(String[] args) {
        MaxBlock object = new MaxBlock();
        object.maxBlock("");
    }

}
