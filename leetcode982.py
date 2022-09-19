// From https://github.com/zhuifengshen/awesome-leetcode/blob/master/docs/Leetcode_Solutions/Python/0982._Triples_with_Bitwise_AND_Equal_To_Zero.md
  class Solution:
    def countTriplets(self, A: 'List[int]') -> 'int':
        res = 0
        count = collections.Counter()
        for i in range(len(A)):
            for j in range(len(A)):
                count[A[i]&A[j]] += 1
        for k in range(len(A)):
            for v in count:
                if A[k] & v == 0:
                    res += count[v]
        return res
