/*
11/05/2015 Zhi Huang Summary
Hashtable:

init: Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();

Get value: table.get(c);
Set value: table.put(c,5);
check key: table.containsKey(c);

*/

import java.util.Hashtable;
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s == null && t == null) return true;
        
        Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (table.containsKey(s.charAt(i))){
                table.put(s.charAt(i), (int)(table.get(s.charAt(i)) + 1));
            }
            else {
                table.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (table.containsKey(t.charAt(i))){
                table.put(t.charAt(i), (int)(table.get(t.charAt(i)) - 1));
            }
            else {
                return false;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (table.get(t.charAt(i)) != 0){
                return false;
            }
        }
        return true;
        
    }
}