    import java.util.Scanner;
public class UKLMEDIUM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di kuis matematika! (ketik 'exit' untuk keluar)");

        while (true) {
            int bilanganPertama = (int) (Math.random() * 100);
            int bilanganKedua = (int) (Math.random() * 99) + 1; // Menghindari pembagian/modulus dengan 0
            String operator = new String[]{ "*", "/", "%" }[(int) (Math.random() * 3)];

            System.out.printf("%d %s %d = ?\n", bilanganPertama, operator, bilanganKedua);
            System.out.print("Jawaban Anda (atau ketik 'exit' untuk keluar): ");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            int jawabanBenar = switch (operator) {
                case "*" -> bilanganPertama * bilanganKedua;
                case "/" -> bilanganPertama / bilanganKedua;
                case "%" -> bilanganPertama % bilanganKedua;
                default -> 0;
            };

            try {
                if (Integer.parseInt(input) == jawabanBenar) {
                    System.out.println("Jawaban Anda benar!");
                } else {
                    System.out.printf("Jawaban Anda salah. Jawaban yang benar adalah: %d\n", jawabanBenar);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau ketik 'exit' untuk keluar.");
            }
        }

        scanner.close();
    }
}