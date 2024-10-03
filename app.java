import java.util.Scanner;

public class App { 
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan (Kg) telur yang dibeli:");
    Double kilotelur = scanner.nextDouble();

    System.out.print("Masukan Uang dibayar:");
    Double uangbayar = scanner.nextDouble();

    Double hargatelur = kilotelur * 28000;
    Double Kembalian = uangbayar - hargatelur;

    System.out.print("Jumlah telur per Kg:" + kilotelur + "kilo");
    System.out.print("Total Harga:" + uangbayar);
    System.out.print("Kembalian:" + Kembalian);

    scanner.close();
    }
}