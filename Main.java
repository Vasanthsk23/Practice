
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.multiplyExact(a,b));
    }
}












