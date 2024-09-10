package org.chandan.twopointers;

public class Pallindrome {

    public static boolean validateString(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left = left + 1;
            right = right - 1;

        }

        return true;
    }
}
