class Solution {
    public boolean isPalindrome(String s) {
        // 1. Clean the string (remove non-alphanumeric and make lowercase)
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        
        String str = cleaned.toString();
        int left = 0;
        int right = str.length() - 1;
        int n = str.length() / 2;

        while (left < n) { 
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Found a mismatch!
            }
            left++;
            right--;
        }
        
        return true;
    }
}
