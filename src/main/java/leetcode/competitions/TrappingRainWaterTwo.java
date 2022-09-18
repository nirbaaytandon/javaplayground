package leetcode.competitions;

import java.util.PriorityQueue;

public class TrappingRainWaterTwo {
    /**
     *     public class Cell {
     *         int row;
     *         int col;
     *         int height;
     *         public Cell(int row, int col, int height) {
     *             this.row = row;
     *             this.col = col;
     *             this.height = height;
     *         }
     *     }
     *
     *     public int trapRainWater(int[][] heights) {
     *         if (heights == null || heights.length == 0 || heights[0].length == 0)
     *             return 0;
     *
     *         PriorityQueue<Cell> queue = new PriorityQueue<>(1, new Comparator<Cell>(){
     *             public int compare(Cell a, Cell b) {
     *                 return a.height - b.height;
     *             }
     *         });
     *
     *         int m = heights.length;
     *         int n = heights[0].length;
     *         boolean[][] visited = new boolean[m][n];
     *
     *         // Initially, add all the Cells which are on borders to the queue.
     *         for (int i = 0; i < m; i++) {
     *             visited[i][0] = true;
     *             visited[i][n - 1] = true;
     *             queue.offer(new Cell(i, 0, heights[i][0]));
     *             queue.offer(new Cell(i, n - 1, heights[i][n - 1]));
     *         }
     *
     *         for (int i = 0; i < n; i++) {
     *             visited[0][i] = true;
     *             visited[m - 1][i] = true;
     *             queue.offer(new Cell(0, i, heights[0][i]));
     *             queue.offer(new Cell(m - 1, i, heights[m - 1][i]));
     *         }
     *
     *         // from the borders, pick the shortest cell visited and check its neighbors:
     *         // if the neighbor is shorter, collect the water it can trap and update its height as its height plus the water trapped
     *        // add all its neighbors to the queue.
     *         int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
     *         int res = 0;
     *         while (!queue.isEmpty()) {
     *             Cell cell = queue.poll();
     *             for (int[] dir : dirs) {
     *                 int row = cell.row + dir[0];
     *                 int col = cell.col + dir[1];
     *                 if (row >= 0 && row < m && col >= 0 && col < n && !visited[row][col]) {
     *                     visited[row][col] = true;
     *                     res += Math.max(0, cell.height - heights[row][col]);
     *                     queue.offer(new Cell(row, col, Math.max(heights[row][col], cell.height)));
     *                 }
     *             }
     *         }
     *
     *         return res;
     *     }
     */
    private class Node implements Comparable<Node> {
        public int x;
        public int y;
        public int h;

        public Node(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        }

        public int compareTo(Node n) {
            return this.h - n.h;
        }
    }

    public int trapRainWater(int[][] heightMap) {
        int[][] hm = heightMap;
        if (hm == null || hm.length == 0 || hm[0].length == 0) {
            return 0;
        }
        PriorityQueue<Node> q = new PriorityQueue<Node>();
        int m = hm.length, n = hm[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            q.add(new Node(i, 0, hm[i][0]));
            q.add(new Node(i, n - 1, hm[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int j = 0; j < n; j++) {
            q.add(new Node(0, j, hm[0][j]));
            q.add(new Node(m - 1, j, hm[m - 1][j]));
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }
        int level = Integer.MIN_VALUE;
        int water = 0;
        int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.x, y = node.y, h = node.h;
            if (h < level) {
                water += level - h;
            }
            level = Math.max(level, h);
            for (int k = 0; k < dir.length; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                    continue;
                }
                if (visited[nx][ny] == true) {
                    continue;
                }
                q.add(new Node(nx, ny, hm[nx][ny]));
                visited[nx][ny] = true;
            }
        }
        return water;
    }
}
