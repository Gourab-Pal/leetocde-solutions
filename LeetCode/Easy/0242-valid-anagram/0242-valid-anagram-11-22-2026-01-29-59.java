class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int n = s.length();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i<n; i++) {
            char c = s.charAt(i);
            int val = sMap.getOrDefault(c, 0);;
            sMap.put(c, val+1);
        }

        for(int i = 0; i<n; i++) {
            char c = t.charAt(i);
            int val = tMap.getOrDefault(c, 0);;
            tMap.put(c, val+1);
        }

        for(Map.Entry<Character, Integer> entry :  sMap.entrySet()) {
            char sKey = entry.getKey();
            int sVal = entry.getValue();

            if(!tMap.containsKey(sKey)) return false;
            if(tMap.get(sKey) != sVal) return false;
        }

        return true;
    }
}