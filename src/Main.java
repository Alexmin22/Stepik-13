import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0.0;
        while (scanner.hasNext()) {
            try {
                d += Double.parseDouble(scanner.next());
            } catch (Exception e) {
            }
        }
        System.out.printf("%f\n", d);
    }
    }
