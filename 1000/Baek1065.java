import java.util.*;
import java.io.*;

class Baek1065{

  boolean function(int n){
    String nString = Integer.toString(n);
    char ints [] = nString.toCharArray();
    int num1, num2, num3;
    boolean ans = false;
    num1 = n/100%10;
    num2 = n/10%10;
    num3 = n%10;

    if(num2*2==num1+num3) ans = true;

    return ans;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = sc.nextInt();
    // int n = 1000;
    Main m = new Main();
    int ans = 0;

    if(n<100){
      System.out.println(n);
      return;
    }
    ans = 99;
    for(int i = 100; i<=n; i++){
      if(i==1000)break;
      if(m.function(i))ans++;
    }
    System.out.println(ans);
  }
}
