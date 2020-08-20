public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length;j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    traverse(grid, i,j, row, col);
                }
            }
        }
        return count;
    }
    public void traverse(char[][] grid, int x,int y, int row, int col) {
        if (x < 0 || x >= row || y < 0 || y >= col) {
            return;
        }
        if (grid[x][y] == '1') {
            grid[x][y] = '2';
            traverse(grid, x+1,y,row,col);
            traverse(grid, x-1,y,row,col);
            traverse(grid, x,y+1,row,col);
            traverse(grid, x,y-1,row,col);
        }
    }
}
