import java.util.*;


class Solution1762 {
    public int[] findBuildings(int[] heights) {
        List<Integer> ans = new ArrayList<>();
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            while (!ans.isEmpty() && heights[ans.get(ans.size() - 1)] <= heights[i]) {
                ans.remove(ans.size() - 1);
            }
            ans.add(i);
            
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i ++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}