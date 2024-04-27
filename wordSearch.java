class wordSearch 
{
    
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0)
            return false;

        int m = board.length;
        int n = board[0].length;

        // Iterate over each cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the starting character matches the first character of the word
                if (board[i][j] == word.charAt(0)) {
                    if (search(board, word, i, j, 0))
                        return true;
                }
            }
        }

        return false;
    }

    private boolean search(char[][] board, String word, int i, int j, int index) {
        int m = board.length;
        int n = board[0].length;

        // Check if the index reaches the length of the word
        if (index == word.length())
            return true;

        // Check boundary conditions and if the character matches
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(index))
            return false;

        // Temporarily mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '*';

        // Explore neighbors
        boolean found = search(board, word, i + 1, j, index + 1) ||
                        search(board, word, i - 1, j, index + 1) ||
                        search(board, word, i, j + 1, index + 1) ||
                        search(board, word, i, j - 1, index + 1);

        // Restore the cell
        board[i][j] = temp;

        return found;
    }
}