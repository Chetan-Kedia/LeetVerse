class Solution {
  public boolean repeatedSubstringPattern(String s) {
    String ds = s + s;
    String trimmed = ds.substring(1, ds.length() - 1);
    return trimmed.contains(s);
  }
}
