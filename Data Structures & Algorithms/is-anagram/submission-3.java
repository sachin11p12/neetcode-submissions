class Solution {
    public boolean isAnagram(String s, String t) {
        // this code - O(nlogn) T complexity because of Sorting 
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // char[] string1 = s.toCharArray();
        // char[] string2 = t.toCharArray();
        // Arrays.sort(string1);
        // Arrays.sort(string2);

        // return Arrays.equals(string1, string2);

        // now i solve this using frequency array
         if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }
}
