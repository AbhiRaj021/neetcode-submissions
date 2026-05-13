class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for(String s: strs) {
            //add length + '#' + string
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();

        int i=0;

        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;  // skip '#'

            // read the actual string
            String word = str.substring(i, i + length);
            decoded.add(word);

            i = i + length;  // move to next word
        }
        return decoded;
    }
}
