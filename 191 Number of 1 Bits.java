public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++){
            if(getBit(n,i) == true){
                count++;
            }
        }
        return count;
    }
    public boolean getBit(int bit, int i){
        System.out.println((bit & (1 << i)));
        if ((bit & (1 << i)) != 0)
        {
            return true;
        }
        return false;
    }
}