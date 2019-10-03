import java.util.*;
import java.io.*;

class Baek1546{


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, temp;

    a = Integer.parseInt(sc.nextLine());
    String string = sc.nextLine();

    // a = 3;
    // String string = "10 20 30";
    double score [] = new double[a];

    String str[] = string.split(" ");
    double max = 0;
    double total = 0;
    for(int i = 0; i<str.length;i++){
        score[i] = Integer.parseInt(str[i]);
        if(score[i]>max)max=score[i];


    }
    for(int i = 0; i<str.length;i++){
    //   score[i] = score[i]/max*100;
      total+=score[i];
      System.out.println(total);
    }
    System.out.println(total);
    System.out.print(total/a);
  }

}
