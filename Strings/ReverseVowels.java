class Solution {
    public String reverseVowels(String s) {

        String reversed = "";
        String reV = "";
        String tR = "";
        int c = 0;

        for(int i=s.length()-1; i>=0; i--){

            char ch = s.charAt(i);

            if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                reV += ch;
            }
        }

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){

                tR += reV.charAt(c);
                c++;

            }else{

                tR += s.charAt(i);

            }
        }
        return tR;
    }
}