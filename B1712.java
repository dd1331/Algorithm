import java.util.Scanner;

public class B1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Long fixedPrice = Long.parseLong(input[0]);
        Long variablePrice = Long.parseLong(input[1]);
        Long productPrice = Long.parseLong(input[2]);

        if (variablePrice == productPrice && productPrice == fixedPrice) {
            System.out.println(-1);
            return;
        }

        if (variablePrice >= productPrice) {
            System.out.println(-1);
            return;
        }
        System.out.println( (fixedPrice / (productPrice - variablePrice)) + 1);
        // for (int i=0; true; i++) {
        //     if(fixedPrice + variablePrice * i < productPrice * i) {
        //         System.out.println(i);
        //         break;
        //     }
        // }
    }
}