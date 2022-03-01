public class Scope {

  public static void main(String[] args) {
    sayHello("Tommy");
    sayHello("");
//    System.out.println(hello); INI AKAN ERROR KARENA HELLO BEDA SCOPE
  }

  static void sayHello(String name) {
    String hello = "Hello " + name;

    if (!name.isBlank()) {
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
//    System.out.println(hi); INI AKAN ERROR KARENA HI BEDA SCOPE
  }
}
