public class Recursion {
    public static int calcuPow(int x, int n)
    {
        if(n == 0)
        {
            //Base Case 1
            return 1;
        }
        if(x == 0)
        {
            //Base case 2
            return 0;
        }
        // Stack Height = log n 
        if( n % 2 == 0)
        {
            //when n is even
            return calcuPow(x, n/2) * calcuPow(x, n/2);
        }
        else
        {
            //when n is odd
            return calcuPow(x, n/2) * calcuPow(x, n/2) * x;
        }
        //Stack Height = n
        /*int powNm1 = calcuPow(x, n-1);
        int powN = x * powNm1;
        return powN;*/
    }
    public static void main(String Args[])
    {
        System.out.println(calcuPow(2,6));
    }
}
