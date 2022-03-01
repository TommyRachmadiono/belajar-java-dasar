public class Array {

  public static void main(String[] args) {
    String[] stringArray;
    stringArray = new String[3];

    String[] stringArray2 = new String[3];

    stringArray[0] = "Tommy";
    stringArray[1] = "Rachmadiono";
    stringArray[2] = "W.S";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    String[] names = {"Tommy", "Rachmadiono", "W.S"};
    names[0] = null;

    int[] arrayOfInt = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

    long[] arrayLong = {10L, 20L, 30L};
    arrayLong[0] = 0;

    System.out.println(arrayLong[0]);
    System.out.println(arrayLong.length);

    String[][] members = {
      {"Tommy", "Rachmadiono"},
      {"Budi", "Nugraha"},
      {"Joko"}
    };

    System.out.println(members[0][1]);
    System.out.println(members[1][0]);
  }
}
