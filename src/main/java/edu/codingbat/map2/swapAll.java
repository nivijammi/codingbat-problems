package edu.codingbat.map2;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 Loop over and then return the given array of non-empty strings as follows: 
 if a string matches an earlier string in the array, swap the 2 strings in the array. 
 When a position in the array has been swapped, it no longer matches anything. Using a map, 
 this can be solved making just one pass over the array. More difficult than it looks.
allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/

public class swapAll {
	
	public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
        	//getting first char from string
            String key = String.valueOf(strings[i].charAt(0));
            System.out.println("key"+ ":"+ key);//value is "a"

            if (map.containsKey(key)) {
                int index = map.get(key);
                System.out.println("index: "+index);//first occurrence is at 0
                
                //swap
                String swap = strings[index];//string that is to be swapped
                System.out.println("swap : "+ ""+swap);
                
                
                strings[index] = strings[i];
                System.out.println("strings[i]: "+ strings[i]);
                System.out.println("strings[index]: "+ strings[index]);
                
                strings[i] = swap;
                System.out.println("swap : "+ swap);
                
                
                
                //remove
                map.remove(key);
                
            } else {
                map.put(key, i);
                
            }
        }
        return strings;
    }

	
	public static void main(String[] args) {
		swapAll object = new swapAll();
		
		//String [] strings = new String []{"ab", "ac"};
		String [] strings = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
		//String [] strings = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
		object.allSwap(strings);
		System.out.println(Arrays.toString(strings));
	}

}
