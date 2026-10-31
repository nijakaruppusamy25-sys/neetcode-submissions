class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.replaceAll("[^a-zA-Z0-9]", "")
.toLowerCase();
        String rev = new                 StringBuilder(ns).reverse().toString();

        return ns.equals(rev);
    }
}