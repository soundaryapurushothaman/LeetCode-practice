class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        String res = reverse(a);
        return res;
    }
    public static String reverse(String[] a) {
        int n = a.length;
        for (int i = 0; i < a.length / 2; i++) {
            String temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        return String.join(" ", a);
    }
}
