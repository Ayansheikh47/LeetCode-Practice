package Strings;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {

        String merged = "";
        int i=0;
        int j=0;

        while(true){

            if(i<word1.length() || j<word2.length()){
                if(i<word1.length()){
                    merged += word1.charAt(i);
                    i++;
                }

                if(j<word2.length()){
                    merged += word2.charAt(j);
                    j++;
                }
            }else{
                break;
            }

        }
        return merged;
    }
}
