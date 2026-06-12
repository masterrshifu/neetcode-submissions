class Solution {
    public boolean isAnagram(String s, String t) {

        // form the two strings first

        return designChar(s).equals(designChar(t));


    }

    public String designChar(String s) {

        int[] count = new int[26];

        for(char c: s.toCharArray()) {
            count[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i: count) {
            sb.append("%");
            sb.append(i);
        }

        return sb.toString();

    }
}
