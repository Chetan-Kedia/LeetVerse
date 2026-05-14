class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(), m=needle.length();
        if(m==0) return 0;

        //Build LPS
        int[] lps=buildLPS(needle);

        int i=0,j=0;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;j++;
            }else if(j>0) j=lps[j-1];
            else i++;
            if(j==m) return i-m;
        }
        return -1;
    }

    private int[] buildLPS(String p){
        int[] lps=new int[p.length()];
        int len=0,i=1;
        while(i<p.length()){
            if(p.charAt(i)==p.charAt(len))
                lps[i++]=++len;
            else if(len>0) len=lps[len-1];
            else lps[i++]=0;
        }
        return lps;
    }
}
