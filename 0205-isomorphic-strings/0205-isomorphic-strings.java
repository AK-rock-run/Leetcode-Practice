class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> hm= new HashMap<>();
        Set<Character> used = new HashSet<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            char a= s.charAt(i);
            char b= t.charAt(i);
            if(hm.containsKey(a)){
                if(hm.get(a)!=b) 
                    return false;
                }else{
                    if(used.contains(b)) return false;
                    hm.put(a,b);
                    used.add(b);
                }
            }
        
        return true;
}
}