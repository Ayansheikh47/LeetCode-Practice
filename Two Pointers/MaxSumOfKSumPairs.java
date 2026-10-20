class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int opCount = 0;

        while(left<right){

            int currentSum = nums[left]+nums[right];
            if( currentSum == k){
                opCount++;
                left++;
                right--;
            }else if(currentSum<k){
                left++;
            }else{
                right--;
            }
        }
        return opCount;
    }
}