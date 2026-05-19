class L304 {
    int pr[][];
    public L304(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        pr=new int[r+1][c+1];
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                pr[i][j]=matrix[i-1][j-1]+pr[i-1][j]+pr[i][j-1]-pr[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;
        int sum=pr[row2][col2]-pr[row1-1][col2]-pr[row2][col1-1]+pr[row1-1][col1-1];
        return sum;
    }
}
