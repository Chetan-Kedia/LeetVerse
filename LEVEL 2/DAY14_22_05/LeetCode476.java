class Solution {
    public int findComplement(int num) {
        int mask = 1;

        // Create a mask with all bits = 1 up to the highest bit of num
        while (mask <= num) {
            mask <<= 1;
        }

        // mask - 1 gives all 1s in range, XOR flips bits
        return (mask - 1) ^ num;
    }
}
