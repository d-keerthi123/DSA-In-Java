public class RatMaze {
    public static boolean isSafe(int maze[][],int r,int c){
        if(r>=0 && r<maze.length &&
            c>=0 && c<maze.length &&
            maze[r][c]==1){
                return true;
            }
            else{
                return false;
            }
            
            
    }
    public static boolean solveMazeUtil(int maze[][],int r,int c,int sol[][]){
        //base case

        if(r==maze.length-1 && c==maze.length-1 && maze[r][c]==1){
            sol[r][c]=1;
            return true;
        }
        //recursion
        if(isSafe(maze, r, c)==true){
            if(sol[r][c]==1){
                return false; //If I’ve already visited this cell in the current path, don’t go there again.
            }

            sol[r][c]=1;
            //down
            if(solveMazeUtil(maze,r+1,c,sol)){
                return true;

            }
            //right
             if(solveMazeUtil(maze,r,c+1,sol)){
                return true;
                
            }
            sol[r][c]=0; //backtracking
        }
        return false;
        
    }
    public static void printMaze(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][]={{1,0,0,0,},
                      {1,1,0,1},
                      {0,1,0,0},
                      {1,1,1,0}};
        int n=maze.length;
        int sol[][]=new int[n][n];
        if(solveMazeUtil(maze,0,0,sol) ==true){
            System.out.println("solution exists");
            printMaze(sol);
        }
        else{
            System.out.println("solution do not exist");
        }
        

    }
}
