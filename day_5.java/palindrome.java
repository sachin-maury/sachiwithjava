class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int reversedInteger = 0, lastDigit, temp;
        temp = x; 
        while (temp != 0) {
            lastDigit = temp % 10;
            reversedInteger = reversedInteger * 10 + lastDigit;
            temp = temp / 10;
        }
                if (reversedInteger == x)
            return true;
        else
            return false;
    }
}