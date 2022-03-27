package edu.codingbat.Recursion1;

public class BunnyEars2 {
    public int bunnyEars2(int bunnies) {

        if(bunnies>= 1 && bunnies%2!=0){
            return bunnyEars2(bunnies-1)+2;
        }
        if(bunnies>= 1 && bunnies%2==0){
            return bunnyEars2(bunnies-1)+3;
        }
        //base case
        else{
            return 0;
        }


    }
    public static void main(String[] args) {
        BunnyEars2 object = new BunnyEars2();
        object.bunnyEars2(0);
    }

}
