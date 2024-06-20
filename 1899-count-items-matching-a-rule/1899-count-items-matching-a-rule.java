class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int count = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        for (List<String> item: items) {
            if (ruleValue.equals(item.get(index))) {
                count++;
            }
        }
        System.gc();
        return count;
    }
}