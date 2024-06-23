class Solution {
    public String predictPartyVictory(String senate) {
        char[] charArray = senate.toCharArray();
        return votingRound(charArray, 0);
    }

    private String votingRound(char[] charArray, int lead) {
        int r = 0, d = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'R') {
                if (lead>=0) {
                    r++;
                } else {
                    charArray[i] = '0';
                }
                lead++;
            } else if (charArray[i] == 'D') {
                if (lead <= 0) {
                    d++;
                } else {
                    charArray[i] = '0';
                }
                lead--;
            }
        }
        if (r!=0 && d == 0) return "Radiant";
        if (r==0 && d!=0) return "Dire";
        return votingRound(charArray, lead);
    }
}