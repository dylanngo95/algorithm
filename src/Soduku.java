import java.util.HashMap;

public class Soduku {

    int[][] sudoku = new int[9][9];

    public boolean validSoduku(int[][] sudoku) {
        HashMap<Integer, Integer> cols = new HashMap<>();
        HashMap<Integer, Integer> rows = new HashMap<>();
        HashMap<String, Integer>[][] subSudoku = new HashMap[3][3];

        int rCount = 9;
        int cCount = 9;

        for (int r = 0; r < rCount; r ++) {
            for(int c = 0; c < cCount; c++) {
                cols.put(c, cols.getOrDefault(c, 0) + sudoku[r][c]);
                rows.put(r, rows.getOrDefault(c, 0) + sudoku[r][c]);

                int subRow = (int) (r / 3);
                int subCol = (int) (c / 3);

                String key = String.valueOf(subRow+subCol);
                subSudoku[subRow][subCol].put(key,
                        subSudoku[subRow][subCol].getOrDefault(key, 0) + sudoku[r][c]
                );
            }
        }

        return true;
    }
}
