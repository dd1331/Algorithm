import java.util.*;

public class B2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = { "c=", "c-", "dz=", "d-", "lj","nj", "s=", "z=" };

        for (int i=0; i<list.length; i++) {
            if (input.contains(list[i])) {
                input = input.replace(list[i], "*");
            };
        }
        System.out.println(input.length());
    }
}