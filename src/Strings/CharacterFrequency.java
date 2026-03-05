package Strings;

public class CharacterFrequency {
    public static void main(String[] args) {
        System.out.println('a' - 'a');//65-65
        System.out.println((char) ('A' + 32));
        System.out.println((char) ('a' - 32));
        String s = "sapthagiri";
        int[] freq = new int[26];// all alpahabets included
        // pangram- a quick brown fox jumps over the lazy dog
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + "->" + freq[i]);
            }

        }
    }
}