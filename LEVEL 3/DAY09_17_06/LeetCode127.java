class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList);
        if(!dict.contains(endWord)) return 0;

        Set<String> beginSet=new HashSet<>();
        Set<String> endSet=new HashSet<>();
        Set<String> visited=new HashSet<>();

        beginSet.add(beginWord); endSet.add(endWord);
        visited.add(beginWord); visited.add(endWord);
        int len=1;

        while(!beginSet.isEmpty()){
            if(beginSet.size() > endSet.size()){
                Set<String> temp=beginSet; beginSet=endSet; endSet=temp;
            }

            Set<String> next= new HashSet<>();
            for(String word:beginSet){
                char[] chars=word.toCharArray();
                for(int i=0;i<chars.length;i++){
                    char orig=chars[i];
                    for(char c='a';c<='z';c++){
                        chars[i]=c;
                        String newWord=new String(chars);
                        if(endSet.contains(newWord)) return len+1;
                        if(dict.contains(newWord) && !visited.contains(newWord)){
                            next.add(newWord); visited.add(newWord);
                        }
                    }
                    chars[i]=orig;
                }
            }
                beginSet=next; len++;
            }
            return 0;
                    }
    
}
