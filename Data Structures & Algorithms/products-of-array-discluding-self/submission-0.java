class Solution {
    public int[] productExceptSelf(int[] nums) {

        int N = nums.length;

        int[] leftProduct = new int[N];
        int[] rightProduct = new int[N];

        leftProduct[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i];
        }

        rightProduct[N-1] = nums[N-1];

        for(int i = N-2; i>=0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i];
        }

        int[] ans = new int[N];

        for(int i=0; i<N; i++) {
            if(i == 0) {
                ans[i] = rightProduct[i+1];
            }
            else if(i == N-1) {
                ans[i] = leftProduct[i-1];
            }
            else {
                ans[i] = leftProduct[i-1] * rightProduct[i+1];
            }
        }

        return ans;
        
    }
}  
