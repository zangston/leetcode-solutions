class Solution {
    public boolean isPalindrome(int x) {
        String intToString = Integer.toString(x);
        char[] intChars = intToString.toCharArray();

        for (int i = 0; i < intChars.length; i++)
        {
            if (intChars[i] != intChars[intChars.length - 1 - i])
                return false;
        }
        return true;
    }
}