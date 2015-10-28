//258 add digits
public class Solution {
    public int addDigits(int num) {
        int cur = 0;
        while (num != 0){
            cur += num - (int)(num/10) * 10;
            num = (int)(num/10);
        }
        while (cur > 9 && cur != 0){
            num = cur;
            cur = 0;
            while (num != 0){
                cur += num - (int)(num/10) * 10;
                num = (int)(num/10);
            }
        }
        return cur;
    }
}