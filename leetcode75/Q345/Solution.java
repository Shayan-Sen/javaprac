package leetcode75.Q345;

class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() < 2)
            return s;

        boolean[] isVowel = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }

        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            while (i < j && !isVowel[chars[i]])
                i++;
            while (i < j && !isVowel[chars[j]])
                j--;

            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }

        return new String(chars);
    }
}