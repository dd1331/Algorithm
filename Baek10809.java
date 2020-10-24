import java.util.*;
class Baek10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        
        ArrayList<String> result = new ArrayList<String>();
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        
        for ( String c : list) {
            result.add(Integer.toString(string.indexOf(c)));
        }
        System.out.println(String.join(" ", result));
        
        sc.close();
    }
}