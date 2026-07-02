// class Solution {
//     public int reverseBits(int n) {
//         int bit = 0;
//         int res = 0 ;
//         for(int i=0;i<32;i++){
//             bit = n & 1;
//             n  = n >>> 1;
//             res = res << 1;
//             res = res | bit;
//         }
//         return res;
        
//     }
// }
public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>>= 1;
        }
        return res;
    }
}