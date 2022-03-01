public class IfStatement {

  public static void main(String[] args) {
    int nilai = 80;
    int absen = 70;

    boolean lulusNilai = nilai >= 75;
    boolean lulusAbsen = absen >= 75;

    boolean lulus = lulusNilai && lulusAbsen;

    if (nilai >= 75 && absen >= 75) {
      System.out.println("Selamat anda lulus");
    } else {
      System.out.println("Silahkan coba lagi");
    }

    if (nilai >= 80 && absen >= 80) {
      System.out.println("Nilai A");
    } else if (nilai >= 70 && absen >= 70) {
      System.out.println("Nilai B");
    } else if (nilai >= 60 && absen >= 60) {
      System.out.println("Nilai C");
    } else if (nilai >= 50 && absen >= 50) {
      System.out.println("Nilai D");
    } else {
      System.out.println("Nilai E");
    }
  }
}
