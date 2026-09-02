class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res =0, ccnt= 0;
        for(int num : nums){
            if (num == 0) {
                res = Math.max(res, ccnt);
                ccnt =0;
            } else {
                ccnt++;
            }
        }
        return Math.max(res, ccnt);
    }
}