import java.util.*;

class Baek2439{


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a, b, c, q, index ;

    a = sc.nextInt();
    // a=5;
    index = a-1;



    for(int j = 0; j<a; j++){
      index--;
      for(int i = 0; i<a; i++){
        if(i>index)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.println();
    }




  }
}
