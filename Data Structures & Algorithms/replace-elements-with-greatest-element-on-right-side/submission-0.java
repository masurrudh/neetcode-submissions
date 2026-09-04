class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ansArray = new int[n];
        int rightMax = -1;

        for (int i = n-1; i >= 0; i--) {
            ansArray[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }

        return ansArray;
    }
}