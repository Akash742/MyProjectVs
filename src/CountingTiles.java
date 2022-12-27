public class CountingTiles {
    public static int countTiles(int n, int m)
    {
        if(n == m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        //Horizontal Placement
        int horizen = countTiles(n-1, m);

        //Vertical Placement
        int verti = countTiles(n-m, m);

        return horizen+verti;
    }
    public static void main(String Args[])
    {
        int n = 4, m  = 2;
        int totalTiles = countTiles(n, m);
        System.out.println("Total No. of Tiles= "+totalTiles);
    }
}
