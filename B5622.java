import java.util.*;

public class B5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split("");
        String[] dials = { "", "","ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
        int sum = 0;

        for (int i=0; i<input.length; i++) {
            for (int j=2; j<dials.length; j++) {
                if (dials[j].indexOf(input[i]) != -1) sum += j+1;
            }
        }
        System.out.println(sum);
    }
}