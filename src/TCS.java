import java.util.*;

public class TCS {
  public static void main(String Args[])
  {
      Scanner sc = new Scanner(System.in);

      String str = sc.nextLine();

      char str1[] = str.toCharArray();
      int count = 0;

      for(int i = 0; i <str1.length; i++) {  
        count = 1;  
        for(int j = i+1; j <str1.length; j++) {  
            if(str1[i] == str1[j] && str1[i] != ' ') {  
                count++;   
                str1[j] = '0';  
            }  
        }   
        if(count > 1 && str1[i] != '0')  
            System.out.print(" " +str1[i] +"-" + count);  
    }  
  }
}
