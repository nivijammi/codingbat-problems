package edu.codingbat.string3;
/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */
public class Ghappy {
    public boolean gHappy(String str) {

        boolean isFound = false;
        str = "x" + str + "x";
        int len = str.length();

        for(int i=1; i<len-1;i++){
            if(str.charAt(i)=='g'){
                if(str.charAt(i-1)!='g' || str.charAt(i+1) !='g'){
                    isFound = false;
                }
                else{
                    isFound=true;
                }

            }
        }
        System.out.println(isFound);
        return isFound;
    }

    public static void main(String[] args) {
        Ghappy object = new Ghappy();
        object.gHappy("xxggyygxx");
    }
}
