public int trapRainWater(int[][] heightMap) {
    if (heightMap == null || heightMap.length <= 2 || heightMap[0].length <= 2)
        return 0;
    PriorityQueue<Cell> queue = new PriorityQueue<>(Comparator.comparingInt((Cell cell) -> cell.height));
    int m = heightMap.length;
    int n = heightMap[0].length;
    boolean[][] visited = new boolean[m][n];
    for (int i = 0; i < m; i++) {
        visited[i][0] = visited[i][n-1] = true;
        queue.add(new Cell(i, 0, heightMap[i][0]));
        queue.add(new Cell(i, n-1, heightMap[i][n-1]));
    }
    for (int i = 1; i < n-1; i++) {
        visited[0][i] = visited[m-1][i] = true;
        queue.add(new Cell(0, i, heightMap[0][i]));
        queue.add(new Cell(m-1, i, heightMap[m-1][i]));
    }
    int result = 0;
    int[][] bounds = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    while (!queue.isEmpty()) {
        Cell cell = queue.poll();
        for (int[] bound : bounds) {
            int row = cell.row + bound[0];
            int col = cell.col + bound[1];
            if (row >= 0 && row < m && col >= 0 && col < n && !visited[row][col]) {
                result += Math.max(0, cell.height - heightMap[row][col]);
                visited[row][col] = true;
                queue.add(new Cell(row, col, Math.max(cell.height, heightMap[row][col])));
            }
        }
    }
    return result;
}

private static class Cell {
    private int row;
    private int col;
    private int height;

    public Cell(int row, int col, int height) {
        this.row = row;
        this.col = col;
        this.height = height;
    }
}

作者：jackie-tien
链接：https://leetcode-cn.com/problems/trapping-rain-water-ii/solution/kuo-zhan-1-djie-yu-shui-wen-ti-zhi-2-d-by-jackie-t/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
