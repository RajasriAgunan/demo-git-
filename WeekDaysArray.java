import java.util.Scanner;

public class WeekDaysArray {
    public static void main(String[] args) throws ArrayIndexOutofBoundsException {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day index(0-6)");
        int dayIndex = Integer.parseInt(scan.nextLine());
        if (dayIndex >= 0 && dayIndex <= weekdays.length) {
            System.out.println("Day at Index" + dayIndex + ":" + weekdays[dayIndex]);
        } else {
            System.out.println("Error:index not in the range"+dayIndex);
        }
        throw new ArrayIndexOutofBoundsException("Error out of index bound "+dayIndex);
    }
}