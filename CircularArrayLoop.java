import java.util.Scanner;

public class CircularArrayLoop {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println(circularArrayLoop(nums));
        }
    }

    public static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int slow = i;
            int fast = i;
            boolean forward = nums[i] > 0;

            while (true) {
                slow = nextIndex(nums, slow, forward);
                fast = nextIndex(nums, fast, forward);

                if (fast != -1) {
                    fast = nextIndex(nums, fast, forward);
                }

                if (slow == -1 || fast == -1) break;

                if (slow == fast) return true;
            }

            int index = i;
            while (true) {
                int next = nextIndex(nums, index, nums[index] > 0);
                if (next == -1 || visited[index]) break;
                visited[index] = true;
                index = next;
            }
        }

        return false;
    }

    private static int nextIndex(int[] nums, int current, boolean forward) {
        if ((nums[current] > 0) != forward) return -1;

        int n = nums.length;
        int next = ((current + nums[current]) % n + n) % n;

        if (next == current) return -1;
        return next;
    }
}
