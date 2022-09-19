class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var maxSize = if(nums.size == 0) 0 else 1
        
        var localSize = 1
        for(i in 1 until nums.size){
            if(nums[i-1] < nums[i]){
                localSize++
            }else{
                localSize = 1
            }
            
            maxSize = Math.max(localSize, maxSize)
        }
        
        return maxSize;
    }
}
