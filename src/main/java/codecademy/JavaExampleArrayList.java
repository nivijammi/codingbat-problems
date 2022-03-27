package codecademy;

import java.util.*;

public class JavaExampleArrayList {
    public static void main(String args[]) {
      /* Creating ArrayList of type "String" which means
       * we can only add "String" elements
       */
        ArrayList<String> Object = new ArrayList<String>();

      //Adding elements to an ArrayList
        Object.add("Aj");
        Object.add("Ezel");
        Object.add("Vj");
        Object.add("Nivi");
        Object.add("xx");

        // Displaying elements
        System.out.println("Original ArrayList:");
        for(String string:Object)
            System.out.println(string);

      /* Adding element at the given index
       * Object.add(0, "x") - Adding element "x" at first position
       * Object.add(1, "Jammi") - Adding element "Jammi" at second position
       */
        Object.add(0, "x");
        Object.add(1, "Jammi");

        // Displaying elements
        System.out.println("ArrayList after add operation:");
        for(String string:Object)
            System.out.println(string);

        //Removing of elements from ArrayList
        Object.remove("x"); //Removes "x" from ArrayList
        Object.remove("xx"); //Removes "xx" from the ArrayList

        // Displaying elements
        System.out.println("ArrayList after remove operation:");
        for(String str:Object)
            System.out.println(str);

        //Removing element from the specified index
        Object.remove(5); //Removes fifth element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for(String string:Object)
            System.out.println(string);
    }
}

