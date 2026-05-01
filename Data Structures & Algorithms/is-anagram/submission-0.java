class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        s.chars().forEach(c->{
            char ch =(char)c;
            arr[ch-97]++;
        });
        t.chars().forEach(c->{
            char ch=(char)c;
            arr[ch-97]--;
        });
        for(int x:arr){
            if(x!=0)
            return false;
        }
        return true;

    }
}
