public class NewCalculator_Test {
  
  private static NewCalculator calc = new NewCalculator();

  public static boolean testStartValueOfFirstNumber() {
    double temp = calc.getFirstNumber();
    if (temp == 0) {
      return true;
    }
    return false;
  }

  public static boolean testStartValueOfSecondNumber() {
    double temp = calc.getSecondNumber();
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

  public static boolean testChangeValueOfSecondNumber() {
    double newValue = 9.1;
    calc.setSecondNumber(newValue);
    if (calc.getSecondNumber() == newValue) {
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

  public static boolean testChangedValueOfSecondNumberIsNotStartValue() {
    double newValue = 9.1;
    calc.setSecondNumber(newValue);
    if (!testStartValueOfSecondNumber()) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    // test start values
    System.out.println("\nTest start values of variables:");
    if (testStartValueOfFirstNumber()) {
      System.out.println("testStartValueOfFirstNumber() " + "PASSED");
    } else {
      System.out.println("testStartValueOfFirstNumber() " + "FAILED");
    }

    if (testStartValueOfSecondNumber()) {
      System.out.println("testStartValueOfSecondNumber() " + "PASSED");
    } else {
      System.out.println("testStartValueOfSecondNumber() " + "FAILED");
    }

    // test change value of variables
    System.out.println("\nTest change values of variables:");

    if (testChangeValueOfFirstNumber()) {
      System.out.println("testChangeValueOfFirstNumber() " + "PASSED");
    } else {
      System.out.println("testChangeValueOfFirstNumber() " + "FAILED");
    }

    if (testChangeValueOfSecondNumber()) {
      System.out.println("testChangeValueOfSecondNumber() " + "PASSED");
    } else {
      System.out.println("testChangeValueOfSecondNumber() " + "FAILED");
    }

    // test changed value of variable firstNumber is not its start value
    System.out.println("\nTest changed values of variables are not start values");
    if (testChangedValueOfFirstNumberIsNotStartValue()) {
      System.out.println("testChangedValueOfFirstNumberIsNotStartValue() " + "PASSED");
    } else {
      System.out.println("testChangedValueOfFirstNumberIsNotStartValue() " + "FAILED");
    }

    if (testChangedValueOfSecondNumberIsNotStartValue()) {
      System.out.println("testChangedValueOfSecondNumberIsNotStartValue() " + "PASSED");
    } else {
      System.out.println("testChangedValueOfSecondNumberIsNotStartValue() " + "FAILED");
    }
  }
}