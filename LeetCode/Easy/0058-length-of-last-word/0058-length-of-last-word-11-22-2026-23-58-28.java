class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].trim().length();
    }

    // rev 22nd nov
}