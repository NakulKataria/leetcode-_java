/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.*/ 

class Solution {
    public int[] plusOne(int[] digits) {
      for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Simply increment if it's less than 9
                return digits;
            }
            digits[i] = 0; // If digit is 9, set it to 0 and carry over
        }
        
        // If all digits were 9, we need an extra digit at the beginning
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    
};
