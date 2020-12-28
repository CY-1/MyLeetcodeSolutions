class Solution {
    int m;
    int n;
    int modularity = 1000000007;
    Long[][][] mem;

    public int findPaths(int m, int n, int N, int i, int j) {
        mem = new Long[N + 1][m][n];
        this.m = m;
        this.n = n;
        return (int) (f(N, i, j) % modularity);
    }

    public Long f(int N, int i, int j) {
        if (N < 0) return 0L;
        if (N == 0) {
            if (i < 0 || i >= m || j < 0 || j >= n) return 1L;
            return 0L;
        }
        if (i < 0 || i >= m || j < 0 || j >= n) return 1L;
        if (mem[N][i][j] != null) return mem[N][i][j];
        Long i1 = (f(N - 1, i + 1, j)
                + f(N - 1, i - 1, j)
                + f(N - 1, i, j + 1)
                + f(N - 1, i, j - 1)) % modularity;
        mem[N][i][j] = i1;
        return i1;
    }
}
