import java.util.Scanner;

public class B10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine().trim();
            // System.out.println(str == null);
            // System.out.println(str == "");
            // System.out.println(str.equals(""));
            // if (str.equals("")) break;
            String[] input = str.split(" ");
            System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));   
        }
    }
}