Code

class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while(read < chars.length){
            int start = read;
            while(read < chars.length && chars[start] == chars[read]) read++;
            int count = read - start;
            chars[write] = chars[start];
            write++;
            if(count > 1){
                int left = write;
                while(count > 0){
                    chars[write] = (char) ('0' + (count%10));
                    write++;
                    count /= 10;
                }
                int right = write - 1;
                while(left < right){
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        return write;
    }
}
