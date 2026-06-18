class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        // Step 1: count frequency
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // Step 2: find first unique
        for(int i = 0; i < s.length(); i++){
            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}