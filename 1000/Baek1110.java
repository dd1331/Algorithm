import java.util.*;
import java.io.*;

class Baek1110{


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try{
      int c, one, two, ans;
      String newNum, nString;
      int count=0;
      int index = 0;
      c = Integer.parseInt(br.readLine());
      // c = 0;
      ans = 0;
      if(c<10)c*=10;
      nString = Integer.toString(c);
      while(true){
        count++;
        if(c==0)break;
        if(ans<10)ans*=10;
        char[] chars = nString.toCharArray();
        one = Character.getNumericValue(chars[0]);

        two = Character.getNumericValue(chars[1]);

        ans = one+two;


        String  answer = Integer.toString(ans);
        char[] chars2 = answer.toCharArray();
        if(ans<10)index=0;
        else index = 1;
        nString = two+""+chars2[index];
        // System.out.println(nString);

        if(Integer.parseInt(nString)==c)break;


      }
      System.out.println(count);
    }catch (Exception e) {
      System.out.println(e);
    }




  }

}
