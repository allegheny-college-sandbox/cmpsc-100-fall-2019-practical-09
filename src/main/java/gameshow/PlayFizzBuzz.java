package gameshow;

public class PlayFizzBuzz {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    int number = 1;
    while (number <= 600) {
      if (number % 3 == 0) {
        System.out.print("Fizz");
      }
      if (number % 5 == 0) {
        System.out.print("Buzz");
      }
      if (number % 3 != 0 && number % 5 != 0) {
        System.out.print(number);
      }
      System.out.println();
      number++;
    }
  }
}