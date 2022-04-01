package edu.codingbat.logic2;

public class CloseFar {
    public boolean closeFar(int a,int b, int c){
        if((a-b<=1 && a-c>=2 || a-c<=1 && a-b>=2)){
            return true;

        }

        return false;
    }

}
