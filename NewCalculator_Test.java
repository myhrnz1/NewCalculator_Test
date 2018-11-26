public class NewCalculator_Test {
  
  // private static NewCalculator calc = new NewCalculator();

  public static boolean testStartValueOfFirstNumber() {
    NewCalculator nCalc = new NewCalculator();
    double temp = nCalc.getFirstNumber();
    if (temp == 0) {
      return true;
    }
    return false;
  }

  public static boolean testStartValueOfSecondNumber() {
    NewCalculator nCalc = new NewCalculator();
    double temp = nCalc.getSecondNumber();
    if (temp == 0) {
      return true;
    }
    return false;
  }

  public static boolean testStartValueOfAnswer() {
    NewCalculator nCalc = new NewCalculator();
    double temp = nCalc.getAnswer();
    if (temp == 0) {
      return true;
    }
    return false;
  }

  public static boolean testStartValueOfOperator() {
    NewCalculator nCalc = new NewCalculator();
    String temp = nCalc.getOperator();
    if (temp.equals("-1")) {
      return true;
    }
    return false;
  }

  public static boolean testChangeValueOfFirstNumber() {
    NewCalculator nCalc = new NewCalculator();
    double newValue = 9.1;
    nCalc.setFirstNumber(newValue);
    if (nCalc.getFirstNumber() == newValue) {
      return true;
    }
    return false;
  }

  public static boolean testChangeValueOfSecondNumber() {
    NewCalculator nCalc = new NewCalculator();
    double newValue = 9.1;
    nCalc.setSecondNumber(newValue);
    if (nCalc.getSecondNumber() == newValue) {
      return true;
    }
    return false;
  }

  public static boolean testChangeValueOfAnswer() {
    NewCalculator nCalc = new NewCalculator();
    double newValue = 9.1;
    nCalc.setAnswer(newValue);
    if (nCalc.getAnswer() == newValue) {
      return true;
    }
    return false;
  }

  public static boolean testChangeValueOfOperator() {
    NewCalculator nCalc = new NewCalculator();
    String newValue = "some value";
    nCalc.setOperator(newValue);
    if (nCalc.getOperator().equals(newValue)) {
      return true;
    }
    return false;
  }

  public static boolean testChangedValueOfFirstNumberIsNotStartValue() {
    NewCalculator nCalc = new NewCalculator();
    double startValue = nCalc.getFirstNumber();
    double newValue = 9.1;
    nCalc.setFirstNumber(newValue);
    if (!(nCalc.getFirstNumber() == startValue)) {
      return true;
    }
    return false;
  }

  public static boolean testChangedValueOfSecondNumberIsNotStartValue() {
    NewCalculator nCalc = new NewCalculator();
    double startValue = nCalc.getSecondNumber();
    double newValue = 9.1;
    nCalc.setSecondNumber(newValue);
    if (!(nCalc.getSecondNumber() == startValue)) {
      return true;
    }
    return false;
  }

  public static boolean testChangedValueOfAnswerIsNotStartValue() {
    NewCalculator nCalc = new NewCalculator();
    double startValue = nCalc.getAnswer();
    double newValue = 9.1;
    nCalc.setAnswer(newValue);
    if (!(nCalc.getAnswer() == startValue)) {
      return true;
    }
    return false;
  }

  public static boolean testChangedValueOfOperatorIsNotStartValue() {
    NewCalculator nCalc = new NewCalculator();
    String startValue = nCalc.getOperator();
    String newValue = "not start value";
    nCalc.setOperator(newValue);
    if (!(nCalc.getOperator().equals(startValue))) {
      return true;
    }
    return false;
  }

  public static boolean testAdd(double d1, double d2) {
    NewCalculator nCalc = new NewCalculator();
    nCalc.setFirstNumber(d1);
    nCalc.setSecondNumber(d2);
    nCalc.add();
    if (nCalc.getAnswer() == (d1 + d2)) {
      return true;
    }
    return false;
  }

  public static boolean testSub(double d1, double d2) {
    NewCalculator nCalc = new NewCalculator();
    nCalc.setFirstNumber(d1);
    nCalc.setSecondNumber(d2);
    nCalc.sub();
    if (nCalc.getAnswer() == (d1 - d2)) {
      return true;
    }
    return false;
  }

  public static boolean testMult(double d1, double d2) {
    NewCalculator nCalc = new NewCalculator();
    nCalc.setFirstNumber(d1);
    nCalc.setSecondNumber(d2);
    nCalc.mult();
    if (nCalc.getAnswer() == (d1 * d2)) {
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

    if (testStartValueOfAnswer()) {
      System.out.println("testStartValueOfAnswer() " + "PASSED");
    } else {
      System.out.println("testStartValueOfAnswer() " + "FAILED");
    }

    if (testStartValueOfOperator()) {
      System.out.println("testStartValueOfOperator() " + "PASSED");
    } else {
      System.out.println("testStartValueOfOperator() " + "FAILED");
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

    if (testChangeValueOfAnswer()) {
      System.out.println("testChangeValueOfAnswer() " + "PASSED");
    } else {
      System.out.println("testChangeValueOfAnswer() " + "FAILED");
    }

    if (testChangeValueOfOperator()) {
      System.out.println("testChangeValueOfOperator() " + "PASSED");
    } else {
      System.out.println("testChangeValueOfOperator() " + "FAILED");
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

    if (testChangedValueOfAnswerIsNotStartValue()) {
      System.out.println("testChangedValueOfAnswerIsNotStartValue() " + "PASSED");
    } else {
      System.out.println("testChangedValueOfAnswerIsNotStartValue() " + "FAILED");
    }

    if (testChangedValueOfOperatorIsNotStartValue()) {
      System.out.println("testChangedValueOfOperatorIsNotStartValue() " + "PASSED");
    } else {
      System.out.println("testChangedValueOfOperatorIsNotStartValue() " + "FAILED");
    }
    
    // test add method
    System.out.println("\nTest add() with various numbers");
    if (testAdd(1,1)) {
      System.out.println("testAdd(1,1) " + "PASSED");
    } else {
      System.out.println("testAdd(1,1) " + "FAILED");
    }

    if (testAdd(5.563434,7.753434289)) {
      System.out.println("testAdd(5.563434,7.753434289) " + "PASSED");
    } else {
      System.out.println("testAdd(5.563434,7.753434289) " + "FAILED");
    }

    if (testAdd(7824826,1923)) {
      System.out.println("testAdd(7824826,1923) " + "PASSED");
    } else {
      System.out.println("testAdd(7824826,1923) " + "FAILED");
    }

    if (testAdd(99999999,1)) {
      System.out.println("testAdd(99999999,1) " + "PASSED");
    } else {
      System.out.println("testAdd(99999999,1) " + "FAILED");
    }

    if (testAdd(-105,5)) {
      System.out.println("testAdd(-105,5) " + "PASSED");
    } else {
      System.out.println("testAdd(-105,5) " + "FAILED");
    }

    if (testAdd(105,-5)) {
      System.out.println("testAdd(105,-5) " + "PASSED");
    } else {
      System.out.println("testAdd(105,-5) " + "FAILED");
    }

    if (testAdd(-1052323434,-5234)) {
      System.out.println("testAdd(-1052323434,-5234) " + "PASSED");
    } else {
      System.out.println("testAdd(-1052323434,-5234) " + "FAILED");
    }

    // test sub method
    System.out.println("\nTest sub() with various numbers");
    if (testSub(1,1)) {
      System.out.println("testSub(1,1) " + "PASSED");
    } else {
      System.out.println("testSub(1,1) " + "FAILED");
    }

    if (testSub(5.563434,7.753434289)) {
      System.out.println("testSub(5.563434,7.753434289) " + "PASSED");
    } else {
      System.out.println("testSub(5.563434,7.753434289) " + "FAILED");
    }

    if (testSub(7824826,1923)) {
      System.out.println("testSub(7824826,1923) " + "PASSED");
    } else {
      System.out.println("testSub(7824826,1923) " + "FAILED");
    }

    if (testSub(100000001,1)) {
      System.out.println("testSub(100000001,1) " + "PASSED");
    } else {
      System.out.println("testSub(100000001,1) " + "FAILED");
    }

    if (testSub(-105,5)) {
      System.out.println("testSub(-105,5) " + "PASSED");
    } else {
      System.out.println("testSub(-105,5) " + "FAILED");
    }

    if (testSub(105,-5)) {
      System.out.println("(testSub(105,-5) " + "PASSED");
    } else {
      System.out.println("(testSub(105,-5) " + "FAILED");
    }

    if (testSub(-1052323434,-5234)) {
      System.out.println("(testSub(-1052323434,-5234) " + "PASSED");
    } else {
      System.out.println("(testSub(-1052323434,-5234) " + "FAILED");
    }

    // test mult method
    System.out.println("\nTest mult() with various numbers");
    if (testMult(1,1)) {
      System.out.println("(testMult(1,1) " + "PASSED");
    } else {
      System.out.println("(testMult(1,1) " + "FAILED");
    }

    if (testMult(5,7)) {
      System.out.println("(testMult(5,7) " + "PASSED");
    } else {
      System.out.println("(testMult(5,7) " + "FAILED");
    }

    if (testMult(7824826,1923)) {
      System.out.println("(testMult(7824826,1923) " + "PASSED");
    } else {
      System.out.println("(testMult(7824826,1923) " + "FAILED");
    }

    if (testMult(0.0000001,0.0000001)) {
      System.out.println("(testMult(0.0000001,0.0000001) " + "PASSED");
    } else {
      System.out.println("(testMult(0.0000001,0.0000001) " + "FAILED");
    }

    if (testMult(-105,5)) {
      System.out.println("(testMult(-105,5) " + "PASSED");
    } else {
      System.out.println("(testMult(-105,5) " + "FAILED");
    }

    if (testMult(105,-5)) {
      System.out.println("(testMult(105,-5) " + "PASSED");
    } else {
      System.out.println("(testMult(105,-5) " + "FAILED");
    }

    if (testMult(-1052323434,-5234)) {
      System.out.println("(testMult(-1052323434,-5234) " + "PASSED");
    } else {
      System.out.println("(testMult(-1052323434,-5234) " + "FAILED");
    }


  }
}