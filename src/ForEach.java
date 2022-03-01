public class ForEach {

  public static void main(String[] args) {
    String[] names = {"Tommy", "Rachmadiono", "W.S", "Programmer", "Fullstack", "Java"};

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    System.out.println("FOREACH");

    for (String name : names) {
      System.out.println(name);
    }
  }
}
