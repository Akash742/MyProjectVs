public class CountPathOfMaze {
    public static int countPathOfMaze(int i, int j, int n, int m)
    {
        if(i == n || j == m)
        {
            return 0;
        }
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
       
        int downPath = countPathOfMaze(i+1, j, n, m);

        int rightPath = countPathOfMaze(i, j+1, n, m);

        return downPath+rightPath;
    }
    public static void main(String Args[])
    {
        int n = 3, m = 3;
        int totalPaths = countPathOfMaze(0, 0, n, m);
        System.out.println("Total Paths of a Maze= "+totalPaths);
    }
}
