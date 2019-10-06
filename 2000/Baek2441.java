import java.util.*;

class Baek2441{


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a, b, c, q, index ;

    a = sc.nextInt();
    // a=5;




    for(int j = 0; j<a; j++){

      for(int i = 0; i<a; i++){
        if(i>=j)
        System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }




  }
}
