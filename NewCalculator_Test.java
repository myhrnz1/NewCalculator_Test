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

  public static boolean testChangedValueOfFirstNumberIsNotStartValue() {
    double newValue = 9.1;
    calc.setFirstNumber(newValue);
    // I read it is considered bad practice to make a test dependable upon another test...
    // is this rule applicable here?
    if (!testStartValueOfFirstNumber()) {
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

    // test changed value of variable firstNumber is not its start value
    if (testChangedValueOfFirstNumberIsNotStartValue()) {
      System.out.println("testChangedValueOfFirstNumberIsNotStartValue() " + "PASSED");
    } else {
      System.out.println("testChangedValueOfFirstNumberIsNotStartValue() " + "FAILED");
    }
  }
}