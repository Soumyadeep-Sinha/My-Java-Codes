public class SubrectangleQueries {
    int[][] data;

    public SubrectangleQueries(int[][] data) {
        this.data = data;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                data[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public static void main(String[] args) {
//        SubrectangleQueries subrectangleQueries = new SubrectangleQueries({{1,2,1},{4,3,4},{3,2,1},{1,1,1}});
        int[][] rec = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};

        SubrectangleQueries rectangle = new SubrectangleQueries(rec);

    }
}
