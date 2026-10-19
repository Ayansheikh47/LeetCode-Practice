class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int write = 0;
        int n = chars.length;

        while(i<n){

            int j=i;
            char cur = chars[i];

            while(j<n && chars[j]==chars[i]){
                j++;
            }

            int count = j-i;

            chars[write] = cur;
            write++;

            if(count>1){
                String cts = String.valueOf(count);
                for(char m : cts.toCharArray()){
                    chars[write] = m;
                    write++;
                }
            }
            i=j;
        }
        return write;
    }
}