class Solution {
    public int missingNumber(int[] nums) {

        // we find length of the array and use sum of series approach to deduce the missing number

        int range = nums.length;

        int actual_sum = (range * (range+1))/2;

        //find sum of elements in the array
        int curr_sum=0;

        for(int i=0; i<range; i++){
            curr_sum+=nums[i];

        } 

        return (actual_sum - curr_sum);
        
    }
}