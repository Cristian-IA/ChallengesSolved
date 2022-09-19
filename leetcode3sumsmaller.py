class Solution(object):
    def threeSumSmaller(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if len(nums) < 3:
            return 0

        sums = 0
        nums.sort()
        for i in range(len(nums) - 2):
            sums += self.__twoSumSmaller(nums[i+1:], target - nums[i])

        return sums
