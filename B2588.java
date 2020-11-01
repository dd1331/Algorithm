import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = Integer.parseInt(sc.nextLine());
        String[] two = sc.nextLine().split("");
        int result = 0;
        String zero = "";

        for (int j=0; j<3; j++) {
            for (int i=0; i<=j; i++) {
                if (i !=0) zero += "0";
            }
            result += one * Integer.parseInt(two[2-j]+zero);
            System.out.println(one * Integer.parseInt(two[2-j]));
            zero = "";
        }
        System.out.println(result);
    }
}