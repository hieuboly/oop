// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {

        this.grid = grid;
	}

	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
    public int charArea(char ch) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;

        int minRow = rows, maxRow = -1;
        int minCol = cols, maxCol = -1;

        // Duyệt toàn bộ bảng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == ch) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }

        // Nếu không tìm thấy ký tự ch
        if (maxRow == -1) return 0;

        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;
        return height * width;
    }

    /**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
    public int countPlus() {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        // duyệt tất cả các ô để chọn tâm
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char ch = grid[i][j];

                // bỏ qua nếu là khoảng trắng hoặc ký tự trống không muốn tính
                // if (ch == ' ') continue;

                int up = 0, down = 0, left = 0, right = 0;

                // đếm lên
                for (int r = i - 1; r >= 0 && grid[r][j] == ch; r--) up++;
                // đếm xuống
                for (int r = i + 1; r < rows && grid[r][j] == ch; r++) down++;
                // đếm trái
                for (int c = j - 1; c >= 0 && grid[i][c] == ch; c--) left++;
                // đếm phải
                for (int c = j + 1; c < cols && grid[i][c] == ch; c++) right++;

                int arm = Math.min(Math.min(up, down), Math.min(left, right));

                if (arm >= 2) {
                    count++;
                }
            }
        }

        return count;
    }


}
