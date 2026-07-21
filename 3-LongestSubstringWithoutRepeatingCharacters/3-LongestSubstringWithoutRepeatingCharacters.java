// Last updated: 21/07/2026, 23:15:50
class Solution {
    public int lengthOfLongestSubstring(String s) {

      int left =0;
      int maxLen = 0;
      HashMap<Character,Integer> mpp = new HashMap<>();

      for(int right =0; right < s.length();right++){

        char ch = s.charAt(right);
        if(mpp.containsKey(ch)){
            left = Math.max(left,mpp.get(ch)+1);
        }
        mpp.put(ch,right);
        maxLen  = Math.max(maxLen,right-left+1);
      }
      return maxLen;
    }
}