class Solution {
    public void moveZeroes(int[] nums) {

        int i=0;
        int write = 0;
        int count = 0;

        while(i<nums.length){

            if(nums[i]!=0){
                nums[write]=nums[i];
                write++;
            }else{
                count++;
            }
            i++;
        }

        while(count>0){
            if(write<nums.length){
                nums[write] = 0;
                write++;
                count--;
            }
        }
        System.out.println(nums);
    }
}