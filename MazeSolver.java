/*
 * MazeSolver.java
 *
 * UVic CSC 115, Spring 2017
 *
 * Purpose:
 *   class that contains a single public static method called
 *   "findPath". To involve the method one must have already created
 *   an instance of Maze. The method must return a path through the
 *   maze (if it exists) in the format shown within the Assignment #3
 *   description.
 *
 * Note: You are free to add to this class whatever other methods will
 * help you in writing a solution to A#3 part 2.
 */

public class MazeSolver {
  public static String findPath(Maze maze) {
    StackRefBased<MazeLocation> testPath = new StackRefBased<MazeLocation>();
    StackRefBased<MazeLocation> correct = new StackRefBased<MazeLocation>();
    boolean [][] daSB = new boolean[maze.getNumRows()][maze.getNumCols()];
    testPath.push(maze.getEntry());
    int col = 0;
    int row = 0;
    try{
      while(!testPath.peek().equals(maze.getExit())&&!testPath.isEmpty()){
        col = testPath.peek().getCol();
        row = testPath.peek().getRow();
        daSB[row][col]= true;
        if(daSB[row +1][col]!= true && !maze.isWall(row + 1, col))
          testPath.push(new MazeLocation(row +1,col));
        else if(!maze.isWall(row -1, col) && daSB[row -1][col] != true)
          testPath.push(new MazeLocation(row -1,col));
        else if(daSB[row][col -1]!= true && !maze.isWall(row, col -1))
          testPath.push(new MazeLocation(row ,col - 1));
        else if(daSB[row][col + 1]!= true && !maze.isWall(row, col + 1))
          testPath.push(new MazeLocation(row,col + 1));
        else
          testPath.pop();
      }
      while(!testPath.isEmpty())
        correct.push(testPath.pop());
    }catch (StackEmptyException foo){
      System.out.println("StackEmptyException caught.");
    }
    return correct.toString();
  }
  // this method is for checking if the current path has been walked through or not.
  /*public static boolean usedPath(int row, int col, StackRefBased<MazeLocation> curpath){
    // make a reference StackRefBased for popping.
    try{

    }catch (StackEmptyException err){
      System.out.println("StackEmptyException caught.");
    }
    return true;
  }*/
}
