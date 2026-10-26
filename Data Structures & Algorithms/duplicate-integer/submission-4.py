class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        res= False
        for num in nums:
            if num not in seen:
                seen.add(num)
                res=False
            else:
                res=True
                break

        return res                