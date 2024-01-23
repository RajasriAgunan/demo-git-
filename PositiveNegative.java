import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        if(n > 0) {
            System.out.println("Positive:" + n);
        } else {
        System.out.println("Negative:" +n);
        }
    }
}