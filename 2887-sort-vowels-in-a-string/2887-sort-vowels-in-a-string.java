class Solution {
    public String sortVowels(String s) {
        char[] ch = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Integer> vowelIndices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(c);
                vowelIndices.add(i);
            }
        }
        Collections.sort(vowels);
        for (int i = 0; i < vowelIndices.size(); i++) {
            ch[vowelIndices.get(i)] = vowels.get(i);
        }
        return new String(ch);
    }
}