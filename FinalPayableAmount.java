import java.util.Scanner;

public class FinalPayableAmount {
    public static void main(String[] args) {
        float finalPayableCost, payableAmount, discountPercentage;
        Scanner scan = new Scanner(System.in);
        payableAmount = scan.nextFloat();
        if ((payableAmount >= 500) && (payableAmount <= 1000)) {
            discountPercentage = (payableAmount * 10) / 100;
            finalPayableCost = payableAmount - discountPercentage;
            System.out.println(finalPayableCost);
        } else if (payableAmount > 1000) {
            discountPercentage = (payableAmount * 20) / 100;
            finalPayableCost = payableAmount - discountPercentage;
            System.out.println(finalPayableCost);
        }else {
            System.out.println(payableAmount);
        }
        }
    }

