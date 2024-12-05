import java.util.Scanner;

public class Tabung {
    
    // Metode untuk menghitung volume tabung
    public static double hitungVolumeTabung(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dari pengguna
        System.out.print("Masukkan jari-jari tabung (radius): ");
        double jariJari = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi tabung (height): ");
        double tinggi = scanner.nextDouble();
        
        // Menghitung volume tabung
        double volumeTabung = hitungVolumeTabung(jariJari, tinggi);
        
        // Menampilkan hasil
        System.out.printf("Volume tabung dengan jari-jari %.2f dan tinggi %.2f adalah: %.2f%n", jariJari, tinggi, volumeTabung);
        
        scanner.close();
    }
}