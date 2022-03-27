package edu.codingbat;

public class makeChocolate {
    /*
    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
     */
    public int makeChocolateSmall(int small, int big, int goal) {
        //How to get small: (big*5+small) = goal
        int smallNeeded =0;
        int smallNow =0;

        //If not enough with big and small combined return -1:

        if((small + big * 5) < goal)
        {
            System.out.println("-1");
            return -1;
        }
        //If big are more than enough reduce the goal by however many values of 5 (for big bars) then return the left over amount for how many small bars:

        else if((big * 5) > goal)
        {
            smallNeeded = goal %5;
            System.out.println(smallNeeded);
            return smallNeeded;
        }
        //If there is not enough big bars to make up the goal reduce the value by all kilos taken up by big bars and take the remaining in small:

        else
        {
            smallNow= goal - big *5;
            System.out.println(smallNow);
            return smallNow;
        }

    }

    public static void main(String[] args) {
        makeChocolate mC = new makeChocolate();
        mC.makeChocolateSmall(4, 1, 10);
    }
}
