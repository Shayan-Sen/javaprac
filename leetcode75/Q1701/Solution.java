package leetcode75.Q1701;

class Solution {

    public boolean isValid(String str1, String str2, int k){
        if(str1.length() % k >0 || str2.length() % k > 0){
            return false;
        }
        String base =  str1.substring(0,k);
        return str1.replace(base,"").isEmpty() && str2.replace(base,"").isEmpty();
    }

    public String gcdOfStrings(String str1, String str2) {
        for(int i = Math.min(str1.length(),str2.length());i >= 1; i--){
            if(isValid(str1,str2,i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }
}

// https://leetcode.com/problems/greatest-common-divisor-of-strings/