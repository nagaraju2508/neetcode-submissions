class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> hmap1=new HashMap<>();
        // HashMap<Character,Integer> hmap2=new HashMap<>();
        // for(char c:s.toCharArray())
        //     hmap1.put(c,hmap1.getOrDefault(c,0)+1);
        // for(char c:t.toCharArray())
        //     hmap2.put(c,hmap2.getOrDefault(c,0)+1);
        // return hmap1.equals(hmap2);
        int []freq=new int[26];
        for(char c:s.toCharArray())
            freq[c-'a']++;
        for(char c:t.toCharArray())
            freq[c-'a']--;
        for(int x:freq)
        {
            if(x!=0)
                return false;
        }
        return true;
    }
}
