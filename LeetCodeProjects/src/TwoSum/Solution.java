import java.util.HashMap;
import java.util.Map;


public static class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        int sizeOfArray = nums.length;
        for (int i = 0; i < sizeOfArray; i++) {
            int diff = target - nums[i];
            if (numToIndexMap.containsKey(diff)) {
                return new int[]{i, numToIndexMap.get(diff)};
            }
            numToIndexMap.put(nums[i], i);
        }
        return null;
    }
}

public void main() {

    Solution.twoSum(new int[]{2, 7, 11, 15}, 9);
    Solution.twoSum(new int[]{3, 2, 4}, 6);

}
