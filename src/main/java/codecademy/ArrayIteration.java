package codecademy;

public class ArrayIteration {
    //this

    public void printStringArray(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            //System.out.println(name);
        }
    }

    public void printIntArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //System.out.println(num);
        }
    }

    public String[] filterName(String[] namesWithA) {
        String[] returnedArray = new String[namesWithA.length];

        for (int i = 0; i < namesWithA.length; i++) {
            String name = namesWithA[i];
            //System.out.println("input array element : "+name); // from the input array
            //System.out.println(returnedArray[i]);// from the output array

            if (name.startsWith("A")) {
                returnedArray[i] = name;
                //System.out.println("element starts with a:  "+returnedArray[i]);
            } else {
                //System.out.println("element does not start with a:  "+returnedArray[i]);
            }

        }
        return returnedArray;
    }

    public static void printArray(String[]filteredNamesWithA) {
        for (int i = 0; i < filteredNamesWithA.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(filteredNamesWithA[i]);
        }

    }

    public int[] divisibleByTwo(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i]);
            if (nums[i] % 2 == 0) {
                newArray[i] = nums[i];
                //System.out.println(newArray[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        ArrayIteration iterator = new ArrayIteration();

        String[] names = {"Sade", "Alexus", "Sam", "Koma"};
        iterator.printStringArray(names);


        int[] nums = {211, 222, 311, 456, 890};
        iterator.printIntArray(nums);
        iterator.divisibleByTwo(nums);

        String[] namesWithA = {"AJ", "Ezel", "Amanda", "Amy"};
        String[] filteredNamesWithA = iterator.filterName(namesWithA);
        printArray(filteredNamesWithA);
        for (int i = 0; i < filteredNamesWithA.length; i++) {
            //System.out.println(filteredNamesWithA[i]);


        }


    }


}
