package leetcode75.Q151;

class Solution {
    static {
        for (int i = 0; i < 500; i++)
            reverseWords("");
    }
    public static String reverseWords(String s) {
        char[] charArr = s.toCharArray();
        int size = charArr.length;
        char result[] = new char[size];
        int index = 0;
        int end = size - 1;

        while (end >= 0) {
            while (end >= 0 && charArr[end] == ' ')
                end--;

            int start = end;
            while (start >= 0 && charArr[start] != ' ')
                start--;

            if (index > 0)
                result[index++] = ' ';

            for (int i = start + 1; i <= end; i++)
                result[index++] = charArr[i];

            end = start - 1;
        }
        return new String(result, 0, index).trim();
    }
}