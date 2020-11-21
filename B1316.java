import java.util.Scanner;

public class B1316 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int repeat = sc.nextInt();
        int count = 0;
        for (int j=0; j<repeat; j++){
            if (check() == true) count ++;
        }
        System.out.println(count);        
    }
    public static boolean check() {
        String input = sc.next();
        boolean[] exist = new boolean[26];
        int previous = 0;
        for (int i=0; i<input.length(); i++){
            int current = input.charAt(i);
            if (previous == current) {
                continue;
            }
            if (exist[current - 'a'] == false) {
                exist[current - 'a'] = true;
                previous = current;
            }
            else {
                return false;
            }
        }
        return true;
    }
}