//import java.util.Scanner;
public class Main {

//    public static int[][] subsetsSumK(int input[], int k) {
//        return helper(input,k,0);
//    }
//    public static int[][] helper(int input[], int k,int si) {
//        if(si==input.length)
//        {
//            if(k==0)
//                return new int[1][0];
//            else
//                return new int[0][0];
//        }
////         if(k==0)
////          return new int [1][0];
//        int op1[][]=helper(input,k-input[si],si+1);
//        int op2[][]=helper(input,k,si+1);
//        int output[][]=new int[op1.length+op2.length][];
//        int l=0;
//        for(int i=0;i<op2.length;i++){
//            output[i]=new int[op2[i].length];
//            for(int j=0;j<op2[i].length;j++)
//                output[l][j]=op2[i][j];
//            l++;
//        }
//        for(int i=0;i<op1.length;i++){
//            output[i+l]=new int[op1[i].length+1];
//            output[i+l][0]=input[si];
//            for(int j=1;j<=op1[i].length;j++){
//                output[i+l][j]=op1[i][j-1];
//            }}
//        return output;
//    }
    static void ratInAMaze(int maze[][],int path[][], int i, int j) {

        if (i < 0 || j < 0 || i >= maze.length || j >= maze.length){
            return;
        }
        if(maze[i][j] == 0){
            return;
        }
        if(path[i][j] == 1){
            return;
        }
        path[i][j]=1;
        if(i == maze.length-1 && j == maze.length-1){
            for(int r=0;r<path.length;r++){
                for(int c=0;c< path.length;c++){
                    System.out.print(path[r][c] + " ");
                }
            }
            System.out.println();
            path[i][j]=0;
            return;
        }

        ratInAMaze(maze,path,i-1,j);

        ratInAMaze(maze,path,i+1,j);

        ratInAMaze(maze,path,i,j-1);

        ratInAMaze(maze,path,i,j+1);

        path[i][j] = 0;

    }
    static void ratInAMaze(int maze[][]) {
        /*
         * Your class should be named Solution.
         * Write your code here
         */
        int x = maze.length;
        int path[][] = new int[x][x];
        ratInAMaze(maze, path, 0, 0);

    }
    public static void main(String[] args) {
//        int a[] = {17, 18, 6, 11, 2, 4 };
        int a[][] = {{1,0},{1,0},{1,1}};
        ratInAMaze(a);
//        int x= Integer.MAX_VALUE;
//        int output[][] = subsetsSumK(a, 5);
//        for(int i = 0; i < output.length; i++) {
//            for(int j = 0; j < output[i].length; j++) {
//                System.out.print(output[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}