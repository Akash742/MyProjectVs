import java.util.*;

public class PalindromeCount{
public static void main(String Args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String str;
  str = sc.nextLine();
  int p = 0;
  
  int t = sc.nextInt();
  int m [] = new int[100];
  String ds = "";
  for(int i = 0; i<t; i++)
  {
    m[i] = sc.nextInt();
  }
  for(int i = 0; i<t; i++)
  {
    for(int k = 0; k<str.length(); k++)
    {
      for(int j = k; j<m[i]+k && str.length()-k>=m[i]; j++)
      {
        ds+= str.charAt(j);
      }
      boolean c  = check(ds);
      
      if(c && ds!="")
      {
        p++;
        c = false;
      }
      ds = "";
    }
  }
  System.out.print(p);
}
  private static boolean check(String ds){
  String b = "";
    for(int i = ds.length()-1; i>=0; i--)
    {
      b = b + ds.charAt(i);
      if(ds.equalsIgnoreCase(b))
      {
        return true;
      }
    }
    return false;
  }
}