package solution;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int bits = 16;
        while (bits > 0) {
            int mask = 0x80000000 >> (bits - 1);
            int swp = 32 / (bits * 2);
            
            int next = 0;
            for (int i = 0; i < swp; i++) {
                next |= (n & mask) >>> bits;
                mask >>>= bits;
                next |= (n & mask) << bits;
                mask >>>= bits;
            }
            n = next;
            
            bits /= 2;
        }
        return n;
    }
}
