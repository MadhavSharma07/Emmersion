public class movezeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[c++] = nums[i];
            }
        }
        while (c < n) {
            nums[c++] = 0;
        }
    }
}
