public class MethodReturnValue {

  public static void main(String[] args) {
    int result1 = sum(100, 100);
    System.out.println(result1);

    System.out.println(sum(200, 200));

    System.out.println(hitung(100,"+",100));
    System.out.println(hitung(200,"-",100));
    System.out.println(hitung(200,"salah",100));
  }

  static int sum(int firstValue, int secondValue) {
    int total = firstValue + secondValue;
    return total;
  }

  static int hitung(int firstValue, String operasi, int secondValue) {
    switch (operasi) {
      case "+":
        return firstValue + secondValue;
      case "-":
        return firstValue - secondValue;
      default:
        return 0;
    }
  }
}
