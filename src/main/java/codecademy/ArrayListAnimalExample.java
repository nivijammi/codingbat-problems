package codecademy;

import java.util.ArrayList;



public class ArrayListAnimalExample extends Object{

    public String toString1(){
        return "";

    }

    public static void main(String[] args) {
        // Creating an arrayList of String
        ArrayList<String> animalsInTheZoo = new ArrayList<>();

        //Adding new elements to the ArrayList
        animalsInTheZoo.add("Zebra");
        animalsInTheZoo.add("Tiger");
        animalsInTheZoo.add("Lion");
        animalsInTheZoo.add("Elephants");
        animalsInTheZoo.add("Giraffe");
        animalsInTheZoo.add("Wombat");
        System.out.println("These are the animals in the zoo " + animalsInTheZoo.toString());

        // Find the size of the ArrayList
        System.out.println("\"The size of the List is \"+ Animal" + animalsInTheZoo.size());

        //access the element at a particular index in an ArrayList using the get() method.

        System.out.println(animalsInTheZoo.get(5));

        //modify the element at a particular index in an ArrayList using the set() method.
        animalsInTheZoo.set(5,"Wilderbeast");
        System.out.println("Modified Animal List "+ animalsInTheZoo);

        // Remove the element "Wombat"
        animalsInTheZoo.remove("Wombat");
        System.out.println("After removing /Wombat/ : " + animalsInTheZoo);

        //// Find the index of the first occurrence of an element in an ArrayList
        
        System.out.println(animalsInTheZoo.indexOf("Elephants"));
    }



}
