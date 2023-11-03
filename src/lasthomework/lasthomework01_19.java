package lasthomework;

import java.util.Scanner;

public class lasthomework01_19 {

  public static String getDayOfWeekNumber(int number) {
    switch (number) {
      case 1:
        return "Monday";
      case 2:
        return "tuesday";
      case 3:
        return "wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      case 7:
        return "Sunday";

    }
    return "";
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int dayOfWeekNumber = scanner.nextInt();
    if (dayOfWeekNumber < 1 || dayOfWeekNumber > 7) {
      System.out.println("Wrong number");
      return;
    }
    System.out.println(getDayOfWeekNumber(dayOfWeekNumber));
  }
}
