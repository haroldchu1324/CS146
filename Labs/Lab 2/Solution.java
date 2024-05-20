import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
