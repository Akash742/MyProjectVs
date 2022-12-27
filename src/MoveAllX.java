public class MoveAllX {
    public static void moveAllX(String str, int idx, int count, String newStr)
    {
        if(idx == str.length())
        {
            for(int i = 0; i<count; i++)
            {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x')
        {
            count++;
            moveAllX(str, idx+1, count, newStr);
        }
        else
        {
            newStr += currChar;
            moveAllX(str, idx+1, count, newStr);
        }
    }
    public static void main(String Args[])
    {
        String str = "axbxxcdx";
        moveAllX(str, 0, 0, "");
    }
    
}
