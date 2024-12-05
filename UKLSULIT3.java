import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class UKLSULIT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input jumlah elemen dalam array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        
        // Membuat array untuk menyimpan elemen
        int[] array = new int[n];
        
        // Memasukkan elemen ke dalam array
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Menghitung frekuensi setiap elemen
        Map<Integer, Integer> frekuensiMap = new HashMap<>();
        for (int elemen : array) {
            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1);
        }
        
        // Menampilkan hasil frekuensi
        System.out.println("Frekuensi setiap elemen dalam array:");
        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
        
        // Menutup scanner
        scanner.close();
    }
}
