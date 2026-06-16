class Solution {
    public void solve(char[][] board) {
        if(board==null ||  board.length==0) return ;

        int rows=board.length;
        int cols=board[0].length;

        //traverse left and right boundaries
        for(int r=0;r<rows;r++){
            dfs(board,r,0);
            dfs(board,r,cols-1);
        }

        //traverse top and bottom boundaries
        for(int c=0;c<cols;c++){
            dfs(board,0,c);
            dfs(board,rows-1,c);
        }

        //final pass
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(board[r][c]=='O'){
                    board[r][c]='X';
                }else if(board[r][c]=='#'){
                    board[r][c]='O';
                }
            }
        }
    }

    private void dfs(char[][] board, int r,int c){
        int rows=board.length;
        int cols=board[0].length;

        if(r<0 || c<0 ||r>=rows || c>=cols){
            return;
        }

        if(board[r][c]!='O'){
            return;
        }

        //mark safe
        board[r][c]='#';

        dfs(board,r+1,c); //down
        dfs(board,r-1,c); //up
        dfs(board,r,c+1); //right
        dfs(board,r,c-1); //left

    }
}
