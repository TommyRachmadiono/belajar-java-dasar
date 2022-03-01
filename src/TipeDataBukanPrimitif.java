public class TipeDataBukanPrimitif {

  public static void main(String[] args) {
    Integer iniInteger = 100;
    Long iniLong = 10000L;

    Byte iniByte = null;
    System.out.println(iniByte);

    iniByte = 100;
    System.out.println(iniByte);

    int iniInt = 100;
    Integer iniObjectInteger = iniInt;

    short iniShort = iniObjectInteger.shortValue();
    long iniLong2= iniObjectInteger.longValue();
    float iniFloat = iniObjectInteger.floatValue();

    Long amount = 1000000L;
  }
}
