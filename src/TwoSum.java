import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> differenceToIndex = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++) {
            if (differenceToIndex.containsKey(nums[i])) {
                return new int[]{differenceToIndex.get(nums[i]),i};
            }
            differenceToIndex.putIfAbsent(target-nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
