package com.linearsearch;

public class LinearSearchString {
    public static void main(String[] args) {
        String str = "Venkatesh";
        char target = 'V';
        boolean res = linearSearchStr(str, target);
        System.out.println(res);
    }

    static boolean linearSearchStr(String str, char target) {
        if(str.isEmpty()){
            return false;
        }
        for (char ch:str.toCharArray()) {
            if(target == ch){
                return true;
            }
        }
        return false;
    }
}
