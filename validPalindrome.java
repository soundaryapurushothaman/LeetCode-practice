class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                clean.append(Character.toLowerCase(c));
            }
        }

        String filtered=clean.toString();
        String rev=clean.reverse().toString();

        return filtered.equals(rev);
    }
}
