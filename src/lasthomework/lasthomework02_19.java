package lasthomework;

import java.util.Scanner;

public class lasthomework02_19 {

  public static int getDaysAmount(String month) {
    switch (month) {
      case "February":
        return 28;
      case "April":
      case "June":
      case "September":
      case "November":
        return 30;
      case " January":
      case "Narch":
      case "May":
      case "August":
      case "October":
      case "Desenber":
        return 31;
    }
    return -1;

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String month = scanner.next();
    System.out.println(getDaysAmount(month));
  }

}
