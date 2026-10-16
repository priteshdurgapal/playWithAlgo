class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;
        int count=0;
        int res=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    //islandCount++;
                    res = Math.max(dfs(grid, i, j),res);
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j) {
        // boundary check
        
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }

        // water or already visited
        if (grid[i][j] == 0) {
            return 0;
        }

        // mark as visited
        grid[i][j] = 0;
        return 1+ (
        // explore neighbors
        dfs(grid, i + 1, j)+ // down
        dfs(grid, i - 1, j)+ // up
        dfs(grid, i, j + 1)+ // right
        dfs(grid, i, j - 1)
         ) // left
        ;
    }
}
