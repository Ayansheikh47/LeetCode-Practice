class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }

        int i=0;
        int left = 0;
        int right = 0;

        while(left<s.length() && right<t.length()){

            if(s.charAt(left)==t.charAt(right)){
                left++;
            }

            right++;

            if(left==s.length()){
                return true;
            }
        }
        return false;
    }
}