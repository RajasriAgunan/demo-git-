import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int reversed=0;
        while(number!=0)
        {
            int digit=number%10;
            reversed=reversed*10+digit;
            number/=10;
        }
        System.out.println(reversed);
    }
}
