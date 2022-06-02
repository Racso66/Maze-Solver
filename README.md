# Maze-Solver
Creates and finds path of different maze <br /> <br />
MazeLocation.java object contain a row & column value indicating a cell position in a 2D maze. <br /> <br />
Maze.java is used to read in maze data from plain-text files, store the maze in a some useful representation that permits querying the state of the maze.<br />
This class makes use of MazeLocation -- itself just a way of encapsulating together a (row, column) pair that can reference some position in the maze. Note that some of the methods in Maze.java take a MazeLocation as a parameter and return a MazeLocation as a result, while some other Maze methods accept as parameters a pair of ints (i.e., row, column). <br /><br />
Mazesolver.java solves if a given maze has a solution or not by keeping track of all the paths walked. <br /><br />
There are references of the stack used in the entire project. <br />
Test contains test files that represent a maze. First row indicates number of rows and columns, the next two rows indicates the start point and end point. Below that is how the maze actually looks like.
