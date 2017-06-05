import java.io.Console;

public class App {
  public static void main(String[] args){
    Console console = System.console();

    System.out.println("Enter a year, I'll tell you if it's a leap year.");
    String userStringYear = console.readLine();
    int userNumYear = Integer.parseInt(userStringYear);

    LeapYear leapYear = new LeapYear();
    Boolean leapYearResult = leapYear.isLeapYear(userNumYear);
    System.out.println("Is " + userStringYear + " a leap year? " + leapYearResult + "!");

  }
}
