import java.util.Scanner;

public class KelilingPersegi {
    public static void main(String[] args) {
        if (args.length > 0) {
            /**
             * Jika ada argumen dari baris perintah
             */
            if (args.length == 1) {
                /**
                 * Cek apakah ada satu argumen
                 */
                try {
                    double sisi = Double.parseDouble(args[0]);
                    double keliling = 4 * sisi;
                    System.out.println("Keliling persegi dengan panjang sisi " + sisi + " adalah " + keliling);
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan harus berupa angka.");
                }
            } else {
                System.out.println("Gunakan satu argumen: panjang sisi persegi.");
            }
        } else {
            /**
             * Jika tidak ada argumen dari baris perintah, minta pengguna memasukkan panjang sisi dari keyboard
             */
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan panjang sisi persegi: ");
            double panjangSisi = input.nextDouble();

            double keliling = 4 * panjangSisi;

            System.out.println("Keliling persegi dengan panjang sisi " + panjangSisi + " adalah " + keliling);
        }
    }
}