class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int startIndex = 0;
        int ans = 0;

        for(int i=0; i<s.length(); i++) {

            if(map.containsKey(s.charAt(i))) {
                startIndex = Math.max(startIndex, map.get(s.charAt(i)) + 1);
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
            }

            int length = i - startIndex + 1;
            ans = Math.max(ans, length);

        }

        return ans;
        
    }
}
