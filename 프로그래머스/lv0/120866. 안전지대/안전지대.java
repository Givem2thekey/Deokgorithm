class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] boomBoard = new int[board.length][board[0].length];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 1) checkExplosion(i,j,boomBoard);
            }
        }
        for(int[] array : boomBoard){
            for(int n : array){
                if(n==0)answer++;
            }
        }
        return answer;
    }

    static void checkExplosion(int x, int y, int[][] board) {
        int bx;
        int by;
        int[] xx = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] yy = {0, -1, 0, 1, -1, 1, -1, 0, 1};
        for (int i = 0; i < 9; i++) {
            bx = x + xx[i];
            by = y + yy[i];
            if (bx < board.length && by < board.length)
                if (bx >= 0 && by >= 0) board[bx][by] = 1;
        }
    }
}