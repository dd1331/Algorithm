import java.util.*;

class Baek1924{


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a, b, m, d, index ;
    String line = sc.nextLine();
    String md []= line.split(" ");
    m = Integer.parseInt(md[0]);
    d = Integer.parseInt(md[1]);
    // m = 3;
    // d = 15;
    int day = 0;

    String week[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

    for(int i = 1; i<m; i++){
      switch(i){
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
            day+=31;
            break;
          case 4:
          case 6:
          case 9:
          case 11:
            day+=30;
            break;
          case 2:
            day+=28;
            break;
      }
    }
    System.out.print(week[(day+d)%7]);
  }
}
