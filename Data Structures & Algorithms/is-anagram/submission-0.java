class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> sc=new HashMap<>();
        HashMap<Character,Integer> tc=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            sc.put(a,sc.getOrDefault(a,0)+1);

            char b=t.charAt(i);
            tc.put(b,tc.getOrDefault(b,0)+1);

        }
        return sc.equals(tc);
    }
}
