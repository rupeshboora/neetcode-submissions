class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left=0;
        int maxFreq = 0;
        int longest=0;

        for(int right=0;right<s.length();right++){
            arr[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(right)-'A']);

            if((right-left+1)-maxFreq>k)
            {
                arr[s.charAt(left)-'A']--;
                left++;
            }
            longest = Math.max(
                longest,
                right - left + 1
            );
        }
        return longest;
    }
}
