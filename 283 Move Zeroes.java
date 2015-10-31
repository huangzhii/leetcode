public class Solution { // O log n. May be I can do better?
    public void moveZeroes(int[] nums) {
        for(int j = nums.length - 1; j >= 0; j--){
            if (nums[j] == 0){
                for(int i = j; i < nums.length - 1; i++){
                    int buf = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = buf;
                }
            }
        }
    }
}