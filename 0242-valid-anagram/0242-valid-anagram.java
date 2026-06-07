// class Solution {
//     public boolean isAnagram(String s, String t) {
//         // HashMap<Character, Integer> hashmap = new HashMap<>();

//         // if (s.length() != t.length()) return false;

//         // // Step 1: Count frequency from s
//         // for (char c : s.toCharArray()) {
//         //     hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
//         // }

//         // // Step 2: Reduce frequency using t
//         // for (char c : t.toCharArray()) {
//         //     if (!hashmap.containsKey(c)) return false;

//         //     hashmap.put(c, hashmap.get(c) - 1);

//         //     if (hashmap.get(c) < 0) return false;
//         // }

//         // return true;
        
//     }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) return false;
        }

        return true;
    }
}