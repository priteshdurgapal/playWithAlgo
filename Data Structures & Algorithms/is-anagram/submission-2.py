class Solution:
    def isAnagram(self, s:str, t:str) -> bool:
        res=[0]*26
        if len(s)!=len(t) :
            return False

        for i in range(len(s)):
            res[ord(s[i])-ord('a')] +=1
            res[ord(t[i])-ord('a')] -=1

        for val in res:
            if val!=0:
                return False
        return True            


        