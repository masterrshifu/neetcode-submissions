class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int N = numbers.length;

        int left = 0;
        int right = N-1;

        while(left < right) {

            int sum = numbers[left] + numbers[right];

            if(target == sum) {
                return new int[]{left+1, right+1};
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
        
    }
}
