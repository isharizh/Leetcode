class Solution {
  public String removeOuterParentheses(String s) {
    int count = 0;
    StringBuilder sb = new StringBuilder(); 
    for (char c : s.toCharArray()) {
      if (c == '(' && count > 0) { 
        sb.append(c);
      } else if (c == ')' && count > 1) {
        sb.append(c);
      }
      count += (c == '(') ? 1 : -1; 
    }
    return sb.toString();
  }
}
