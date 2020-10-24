import java.util.Scanner;

public class Baek1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String str[] = string.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        if (a > b) {
            System.out.println(">");
        }
        if (a < b) {
            System.out.println("<");
        }
        if (a == b) {
            System.out.println("==");
        }
        sc.close();
    }
}