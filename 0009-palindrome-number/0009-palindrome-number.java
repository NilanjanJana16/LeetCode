class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        int reversed = 0, original = x;
        while (x != 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }
        
        return original == reversed;
    }
}