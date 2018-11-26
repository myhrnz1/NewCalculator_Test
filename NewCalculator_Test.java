public class NewCalculator_Test {
  
  private static NewCalculator calc = new NewCalculator();

  public static boolean testStartValueOfFirstNumber() {
    double temp = calc.getFirstNumber();
    if (temp == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    if (testStartValueOfFirstNumber()) {
      System.out.println("testStartValueOfFirstNumber() " + "PASSED");
    } else {
      System.out.println("testStartValueOfFirstNumber() " + "FAILED");
    }
  }
}