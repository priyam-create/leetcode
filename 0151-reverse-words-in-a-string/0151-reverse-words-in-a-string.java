class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        int l=0;
        int r=words.length-1;
        for(int i=r;i>=l;i--){
            sb.append(words[i]);
            if(i>l){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}