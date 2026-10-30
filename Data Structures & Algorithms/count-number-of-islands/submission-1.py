class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid or len(grid)==0 :
            return 0

        r,c=len(grid), len(grid[0])
        count=0

        for i in range(r):
            for j in range(c):
                if grid[i][j] =='1':
                    count+=1
                    self.dfs(grid,i,j)

        return count
        
    def dfs(self,grid:List[List[str]],i:int,j:int) :
        if i<0 or j<0 or i>=len(grid) or j>=len(grid[0]):
            return

        if grid[i][j] =='0':
            return

        grid[i][j]='0'

        self.dfs(grid,i,j+1)
        self.dfs(grid,i,j-1)
        self.dfs(grid,i-1,j)
        self.dfs(grid,i+1,j)

