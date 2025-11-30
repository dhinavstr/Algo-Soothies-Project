import java.util.Scanner;

public class OwnerFlow {

    public static void startOwnerMenu() {
        Scanner sc = new Scanner(System.in);

        // Login Admin
        System.out.println("=== OWNER LOGIN ===");
        System.out.print("Masukkan Username: ");
        String user = sc.nextLine();
        System.out.print("Masukkan Password: ");
        String pass = sc.nextLine();

        if (!OwnerAuth.login(user, pass)) {
            System.out.println("Login gagal! Username atau password salah.");
            return; // kembali ke main
        }

        // Jika login berhasil
        int pilih;
        do {
            System.out.println("\n=== OWNER MENU ===");
            System.out.println("1. Laporan Penjualan Produk Terlaris");
            System.out.println("2. Pengelolaan Stok Inventaris");
            System.out.println("3. Kembali ke Role");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Menampilkan laporan produk terlaris...");
                    // nanti disambung ke fitur laporan
                    break;

                case 2:
                    System.out.println("Menampilkan dan mengelola stok...");
                    // nanti disambung ke fitur stok
                    break;

                case 3:
                    System.out.println("Kembali ke menu role...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 3);
    }
}
