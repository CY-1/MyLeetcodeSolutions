class Solution {
int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

public int minimumEffortPath(int[][] heights) {
    int left = 0;
    int right = 1000000;
    //二分查找搜索最小值
    while (left < right) {
        int mid = (left + right) >>> 1;
        if (!dfs(0, 0, mid, heights, new boolean[heights.length][heights[0].length])) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

//检查是否存在一条从(x,y)到终点的路径，该路径中相邻顶点绝对值差不大于max
boolean dfs(int x, int y, int max, int[][] h, boolean[][] visited) {
    if (x == h.length - 1 && y == h[0].length - 1) {
        return true;
    }
    visited[x][y] = true;
    for (int[] dir : dirs) {
        int nx = x + dir[0];
        int ny = y + dir[1];
        if (nx >= 0 && nx < h.length && ny >= 0 && ny < h[0].length && !visited[nx][ny]
                && Math.abs(h[nx][ny] - h[x][y]) <= max) {
            if (dfs(nx, ny, max, h, visited)) {
                return true;
            }
        }
    }
    return false;
}


}
