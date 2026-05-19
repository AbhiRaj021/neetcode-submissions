class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int i=0; i<s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(i)));

            int currentWindow = i - left + 1;
            int replacement = currentWindow - maxFreq;

            if(replacement > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
