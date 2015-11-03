// lots of submission! be careful!
public class Solution {
    public int titleToNumber(String s) {
        if (s.length() == 0 || s == null){
            throw new IllegalArgumentException("Input is not valid!");
        }
        int index = 0;
        for (int i = 0; i < s.length(); i++){
            index += Math.pow(26,(s.length() - 1 - i)) * (int)(s.charAt(i) - 'A' + 1);
        }
        return index;
    }
}