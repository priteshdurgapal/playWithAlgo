class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        
        if len(s1)>len(s2):
            return False

        counts1, counts2=[0]*26, [0]*26

        for i in range(len(s1)):
            counts1[ord(s1[i])-ord('a')]+=1
            counts2[ord(s2[i])-ord('a')]+=1

        matches=0
        for i in range(26):
          if counts1[i]==counts2[i]:
            matches+=1 

        #1 1 1 0 0 0 0 
        #0 0 1 0 0 0 0 
        if matches ==26:
            return True

        for i in range(len(s1),len(s2)):
            matches=0    
            counts2[ord(s2[i])-ord('a')]+=1
            counts2[ord(s2[i-len(s1)])-ord('a')]-=1

            for j in range(26):
                if counts2[j]==counts1[j]:
                    matches+=1
            
            if matches==26:
                return True
        
        return False
            








        