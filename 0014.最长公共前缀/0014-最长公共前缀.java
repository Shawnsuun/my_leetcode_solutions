class Solution {
    public String longestCommonPrefix(String[] strs) {      
        String commonPrefix = strs[0];
        for (int i = 0; i < strs.length; i ++) { 
            while (!(strs[i]).startsWith(commonPrefix)) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }
        return commonPrefix;
    }
}