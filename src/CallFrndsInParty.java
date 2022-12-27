public class CallFrndsInParty {
    public static int callGuest(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        //Single
        int way1 = callGuest(n-1);

        //Pair
        int way2 = (n-1) * callGuest(n-2);

        return way1+way2;
    }
    public static void main(String Args[])
    {
        int n = 4;
        int waysToCallGuest = callGuest(n);
        System.out.println("No. of ways to call Guest= "+waysToCallGuest);
    }
    
}
