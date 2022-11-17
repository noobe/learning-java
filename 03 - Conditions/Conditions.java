class Conditions {
  public static void main(String args[]) {
    int x = 5;
    if (x>4) {
      System.out.println("X is greater than 4.");
    }

    if (x<10) {
      System.out.println("X is less than 10.");
    } else {
      System.out.println("X is greater than 10.");
    }

    String res = x > 3 ? "X is greater than 3" : "X is less than 3";
    System.out.println(res);
  }
}