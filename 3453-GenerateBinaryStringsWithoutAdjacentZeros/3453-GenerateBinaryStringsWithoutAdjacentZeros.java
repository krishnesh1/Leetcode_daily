// Last updated: 21/07/2026, 23:10:49
class Solution {

    public void solve(List<String> list, int n, String str) {

        if (str.length() == n) {

            list.add(str);
            return;
        }

        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {

            solve(list, n, str + "0");
        }
        solve(list, n, str + "1");
    }

    public List<String> validStrings(int n) {

        List<String> list = new ArrayList<>();

        solve(list, n, "");

        return list;
    }
}