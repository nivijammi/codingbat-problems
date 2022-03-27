package edu.codingbat.string2;

public class WordEnds {
	public String wordEnds(String str, String word) {
		  StringBuilder s = new StringBuilder();
		  for (int i=0; i<str.length()-word.length(); i++){
		    if(i!=0 && str.charAt(i)=='X' 
				    		&& str.charAt(i+1)== 'Y'){
		      s.append(str.charAt(i - 1));
		      s.append(str.charAt(i + 2));
		    }
		    if(i==0 && str.charAt(i)=='X' 
		    		&& str.charAt(i+1)== 'Y'){
		    	
		    	s.append(str.charAt(i + 2));
		    }
		    if(i==(str.length()-2) && str.charAt(i)=='X' 
		    		&& str.charAt(i+1)== 'Y'){
		    	
		    	s.append(str.charAt(i-1));
		    }
		  
		  }
		  System.out.println(s);
		  return str;
		  
		}
	public static void main(String[] args) {
        WordEnds object = new WordEnds();
        object.wordEnds("XY123XY", "XY");
    }

}
