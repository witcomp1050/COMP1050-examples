public class Slide82 {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println(grid[1][2]);
        System.out.println(grid.length + " rows, " + grid[0].length + " columns");
        
        int total = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                total += grid[r][c];
            }
        }
        System.out.println(total);
    }
}
