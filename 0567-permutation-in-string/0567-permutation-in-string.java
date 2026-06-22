class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // int count=0;
        // int i=0;
        // char[] s2_=s2.toCharArray();
        // while(count<s1.length()){
        //     if(s1.contains(s2_[i])){
        //         i++;
        //         count++;
        //     }
        //     if(count!=0 && !s1.contains(s2_[i]))
        //         count=0;
        // }
        // if(count==s1.length())
        //     return true;
        // return false;

        if (s1.length() > s2.length())
            return false;

        int[] s1Count = new int[26];
        int[] window = new int[26];

        // count s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            window[s2.charAt(right) - 'a']++;

            // maintain window size
            if (right - left + 1 > s1.length()) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }

            // check match
            if (Arrays.equals(s1Count, window)) {
                return true;
            }
        }

        return false;

    }

}
