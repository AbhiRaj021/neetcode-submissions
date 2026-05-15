class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // create array of hashset to track seen numbers
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        // Initialize each Hashset in arrays
        for(int i=0; i<9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();

        }

        for(int r=0; r<9; r++) {

            for(int c=0; c<9; c++) {

                char val = board[r][c];

                //skip empty cell
                if(val == '.') {
                    continue;
                }

                // 2. Determine which 3 * 3 box we are in (0-8)
                int boxIndex = (r/3) * 3 + (c/3);


                // 3. check for duplicates in Rows, Column, and Box
                // add() return false if the element was already present

                if (!rows[r].add(val) || 
                    !cols[c].add(val) || 
                    !boxes[boxIndex].add(val)) {
                    return false;
                }
            }
        }
        return true;
    }
}
