class Solution {
    
    // int[] nums;

    // In place array manipulation --> Use the input array as aux storage to get O(1) space

    // Placing elements at their correct indices through swapping
    
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                seen[num - 1] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                return i + 1;
            }
        }

        return n + 1;
    }
}