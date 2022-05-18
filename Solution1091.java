import java.util.*;


class Solution1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int len = grid.length;
        int [][] direction = {{1, 0}, {1, -1}, {1, 1}, {0, 1}, {0, -1}, {-1, 0}, {-1, 1}, {-1, -1}};

        if (grid[0][0] == 1 || grid[len - 1][len - 1] == 1) {
            return -1;
        }
        boolean[][] visited = new boolean[grid.length][grid.length];
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0, 1});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];
            int dis = cur[2];
            if (row == len - 1 && col == len - 1) {
                return dis;
            }
            if (visited[row][col] == true) {
                continue;
            }
            visited[row][col] = true;;

            for (int i = 0; i < direction.length; i ++) {
                int x = direction[i][0];
                int y = direction[i][1];
                int new_row = row + x;
                int new_col = col + y;
                if (new_row >= 0 && new_row < len && new_col >= 0 && new_col < len && grid[new_row][new_col] == 0) {
                    q.offer(new int[]{new_row, new_col, dis + 1});
                }

            }

        }


        return -1;
    }
}