import java.util.Scanner;

public class UKLMUDAH1{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input berat paket
            System.out.print("Masukkan berat paket (kg): ");
            double berat = scanner.nextDouble();
            // Input jaraktempuh paket
            System.out.print("Masukkan jarak tempuh (km): ");
            double jarak = scanner.nextDouble();

            // Input dimensi paket
            System.out.print("Masukkan panjang paket (cm): ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar paket (cm): ");
            double lebar = scanner.nextDouble();
            System.out.print("Masukkan tinggi paket (cm): ");
            double tinggi = scanner.nextDouble();

            //Menghitung volume paket
            double volume = panjang * lebar * tinggi;
            
            // Menghitung biaya paket
            double biayaPerKg;
            if (jarak <= 10) {
                biayaPerKg = 4250;
            } else {
                biayaPerKg = 6000;
            }
    
            // Menghitung biaya pengiriman
            double biayaPengiriman = berat * biayaPerKg;
    
            // Menambahkan biaya tambahan jika volume melebihi 100 cm3
            if (volume > 100) {
                biayaPengiriman += 50000;
            }
    
            // Menampilkan total biaya pengiriman
            System.out.printf("Total biaya pengiriman: Rp %.2f\n", biayaPengiriman);
    
            scanner.close();
        }
    }

