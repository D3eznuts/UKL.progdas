import java.util.Scanner;

public class UKLSULIT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
        // Array untuk menyimpan nilai
        double[] nilaiSiswa = new double[jumlahSiswa];
        
        // Memasukkan nilai untuk setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = scanner.nextDouble();
        }
        
        // Menghitung rata-rata nilai
        double totalNilai = 0;
        for (double nilai : nilaiSiswa) {
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai / jumlahSiswa;
        
        // Menampilkan hasil
        System.out.printf("Rata-rata nilai ujian dari %d siswa adalah: %.2f%n", jumlahSiswa, rataRata);
        
        // Menutup scanner
        scanner.close();
    }
}
