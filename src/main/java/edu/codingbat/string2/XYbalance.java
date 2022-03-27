package edu.codingbat.string2;

public class XYbalance {
    /*
      We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
*/
    public boolean xyBalance(String str) {

  /*

     condition 1: y should appear later than x
     condition 2: one y can balance multiple x's
     inference: we need to see that 'y' appears first...one 'y' is enough

  */

        int len = str.length() - 1;
        char ch;
        for(int i = len; i >= 0; i--)
        {
            ch = str.charAt(i);
            if(ch == 'x') {
                System.out.println("false");
                return false;
            }
            else if(ch == 'y') {
                System.out.println("true");
                return true;
            }
        }
        return true;
    }
/*
    coding bat solution:
    public boolean xyBalance(String str) {
      // Find the rightmost y
      int y = -1;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)=='y') y = i;
      }

      // Look at the x's, return false if one is after y
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)=='x' && i > y) return false;
      }
      return true;

      // Solution notes: this solution uses two loops, each written the simple
      // 0..length way. You could do it with a single reverse loop, noticing
      // if you see an x before a y. Or use lastIndexOf().
    }
 */

        public static void main(String[] args) {
        XYbalance balance = new XYbalance();
        balance.xyBalance("aaxbb");
    }
}
