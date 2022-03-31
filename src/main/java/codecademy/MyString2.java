package codecademy;

public class MyString2 {
    public static void main(String[] args){
        String s = "xHixx";
        

        String newString = "";
        for (int i = 0,n = s.length(); i <n ; i++){
            for (int j=0,m=s.length();i<m;i++)
            
            newString = newString + s.charAt(i);
            System.out.println(newString);
            if (s.charAt(0)== 'x'){


            }

        }



    }

}