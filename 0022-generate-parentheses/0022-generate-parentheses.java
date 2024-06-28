class Solution {
  public List<String> generateParenthesis(int n) {
    ArrayList<String> ans = new ArrayList<>();
    dfs(n, n, new StringBuffer(), ans);
    return ans;
  }

  private void dfs(int l, int r, final StringBuffer sb, List<String> ans) {
    if (l == 0 && r == 0) {
      ans.add(sb.toString());
      return;
    }

    if (l > 0) {
      sb.append("(");
      dfs(l - 1, r, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
    if (l < r) {
      sb.append(")");
      dfs(l, r - 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}