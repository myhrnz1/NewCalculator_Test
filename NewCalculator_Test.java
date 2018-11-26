public class NewCalculator_Test {
  
  private static NewCalculator calc = new NewCalculator();

  public static boolean testStartValueOfFirstNumber() {
    double temp = calc.getFirstNumber();
    if (temp == 0) {
      return true;
    }
    return false;
  }

  public static boolean testChangeValueOfFirstNumber() {
    double newValue = 9.1;
    calc.setFirstNumber(newValue);
    if (calc.getFirstNumber() == newValue) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    // test start value of variable firstNumber
    if (testStartValueOfFirstNumber()) {
      System.out.println("testStartValueOfFirstNumber() " + "PASSED");
    } else {
      System.out.println("testStartValueOfFirstNumber() " + "FAILED");
    }

    // test change value of variable firstNumber
    if (testChangeValueOfFirstNumber()) {
      System.out.println("testChangeValueOfFirstNumber() " + "PASSED");
    } else {
      System.out.println("testChangeValueOfFirstNumber() " + "FAILED");
    }
  }
}