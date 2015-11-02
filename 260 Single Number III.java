/*

Really good problem about bit manipulation!
Suggestion: write them down in paper and test them.

Inspired by and thanks to https://github.com/shogunsea/lintcode/blob/master/single-number-iii.java

Given 2*n + 2 numbers, every numbers occurs twice except two, find them.
Example
Given [1,2,2,3,4,4,5,3] return 1 and 5
Challenge
O(n) time, O(1) extra space.
Thinking Process:
The 2 exception must have this feature: a ^ b != 0, since they are different
Still want to do 2n + 1 problem as in Single Number I, then we need to split a and b into 2 groups and deal with two 2n+1 problems
Assume c = a^b, there mush be a bit where a and b has the difference, so that bit in c is 1.
Find this bit position and use it to split the group: shift number in the array by ‘bit-position’ indexes. If the shifted number has 1 at the ‘bit-position’, set it to one group; otherwise to another group. 
*/
public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i : nums){
            xor ^= i;
        }
        int oneBit = 1;
        for (int i = 0; i <= 32; i++){
            oneBit = 1 << i;
            if ((xor & oneBit) != 0){ // at there, != 0 is better than == 1 !
                oneBit = i;
                break;
            }
        }
        int result[] = {0,0};
        for (int i : nums){
            if(((i >> oneBit) & 1) == 1){
                result[0] ^= i;
            }
            else{
                result[1] ^= i;
            }
        }
        return result;
    }
}