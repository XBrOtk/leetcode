import java.util.*;


class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int prev = 0;
        int diff = 0;
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < n; i++) {
            prev += nums[i];
            diff = prev - k;
            if (mp.containsKey(diff)) {
                res += mp.get(diff);
            }
            if (mp.containsKey(prev)) {
                mp.put(prev, mp.get(prev) + 1);
            }
            else {
                mp.put(prev, 1);
            }
        }
        return res;
    }
}