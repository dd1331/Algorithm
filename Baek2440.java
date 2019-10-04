import java.util.*;

class Baek2440{


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a, b, c, q, index ;

    a = sc.nextInt();
    // a=5;




    for(int j = 0; j<a; j++){

      for(int i = 0; i<a-j; i++){

        System.out.print("*");
      }
      System.out.println();
    }




  }
}
