import java.util.Scanner;

public class Hitungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan suhu dalam Celcius:");
        Double celcius = input.nextDouble();
        Double fahrenheit = (celcius * 9/5) + 32;
        System.out.print("Suhu dalam fahrenheit:" + fahrenheit);

        System.out.print("Masukan jari jari lingkaran:");
        Double jarijari = input.nextDouble();
        Double keliling = 2 * Math.PI * jarijari;
        System.out.print("Keliling Lingkaran:" + keliling);

        System.out.print("Masukan luas persegi panjang:");
        Double panjang = input.nextDouble();
        System.out.print("Masukan Lebar Persegi Panjang:");
        Double lebar = input.nextDouble();
        Double luas = panjang * lebar;
        System.out.print("Keliling Persegi Panjang:" + luas);

        System.out.print("Masukan Volume Kubus:");
        Double sisi = input.nextDouble();
        Double volume = sisi * sisi * sisi;
        System.out.print("Volume Kubus:" + volume);

        input.close();
    }
}