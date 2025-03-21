package leetcode75.Q1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder word = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            word.append(word1.charAt(i));
            word.append(word2.charAt(j));
            i++;
            j++;
        }
        if (word1.length()>word2.length()) {
            word.append(word1.substring(i, word1.length()));
        }
        if (word2.length()>word1.length()) {
            word.append(word2.substring(j, word2.length()));
        }

        return word.toString();
    }
}

// https://leetcode.com/problems/merge-strings-alternately/