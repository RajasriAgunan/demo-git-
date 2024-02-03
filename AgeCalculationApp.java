import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculationApp {
    public static void main(String[] args){
        System.out.println("yyyy-mm-dd");
        Scanner scan=new Scanner(System.in);
        String birthdaystring=scan.nextLine();
        LocalDate birthday=LocalDate.parse(birthdaystring);
        Period age=Period.between(birthday,LocalDate.now());
        System.out.printf("Your age is %dyears,%dmonths,%ddate %n",age.getYears(),age.getMonths(),age.getDays());
    }
}
