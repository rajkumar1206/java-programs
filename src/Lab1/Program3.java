package Lab1;

public class Program3 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++) {
            System.out.println(m + " x " + i + " = " + (m*i));
        }
    }
}
