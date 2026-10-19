class Solution {
    public String reverseWords(String s) {

        List<String> sep = new ArrayList<>(Arrays.asList(s.split(" ")));
        int i = 0;
        sep.removeIf(word -> word.trim().isEmpty());

        Collections.reverse(sep);
        return String.join(" ",sep);

    }
}