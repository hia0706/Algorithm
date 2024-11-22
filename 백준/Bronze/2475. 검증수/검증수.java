import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int result = 0;
        for (String s : str) {
            int num = Integer.parseInt(s);
            result += num * num;
        }
        System.out.println(result % 10);
    }    
}