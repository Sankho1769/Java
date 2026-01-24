import java.util.*;

class Solution {

    public int minimumPairRemoval(int[] nums) {
        List<Long> list = new ArrayList<>();
        for (int x : nums) list.add((long) x);

        int ops = 0;

        while (!isNonDecreasing(list)) {
            int idx = 0;
            long minSum = Long.MAX_VALUE;

            for (int i = 0; i < list.size() - 1; i++) {
                long sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            long merged = list.get(idx) + list.get(idx + 1);
            list.remove(idx + 1);
            list.set(idx, merged);

            ops++;
        }

        return ops;
    }

    private boolean isNonDecreasing(List<Long> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) return false;
        }
        return true;
    }
}
