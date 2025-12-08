package algosmoothie;

import java.util.Scanner;

public class Main {
    
    // Objek Scanner tunggal (Static)
    private static Scanner appScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("             HOMEPAGE");
        System.out.println("---- WELCOME TO ALGOSMOOTHIES ----");
        System.out.println("ROLES ");
        System.out.println("1. OWNER");
        System.out.println("2. CUSTOMER");
        System.out.println("0. EXIT APP");
        
        System.out.print("Choose your role : ");
        
        if (appScanner.hasNextInt()) {
            int role = appScanner.nextInt();
            appScanner.nextLine(); // Konsumsi newline

            if (role == 1){
                homepageOwner(appScanner); // Meneruskan Scanner
            } else if (role == 2){
                homepageCust(appScanner); // Meneruskan Scanner
            } else if(role == 0){
                System.out.println("Exiting...");
                System.out.println("Thank you for visiting ALGOSMOOTHIES");
                appScanner.close(); // Tutup scanner saat program benar-benar keluar
            } else {
                System.out.println("Pilihan tidak valid.");
                Main.main(null); // Ulangi
            }
        } else {
            System.out.println("Input harus berupa angka.");
            appScanner.nextLine(); // Konsumsi input yang salah
            Main.main(null); // Ulangi
        }
    }
    
    // Menerima Scanner sc
    public static void homepageOwner(Scanner sc){
        System.out.println("---- WELCOME OWNER ----");
        System.out.println("1. Cek History Pesanan");
        System.out.println("2. Search Fruit Stok");
        System.out.println("3. Keseluruhan Stok (real-time) ");
        System.out.println("4. Tambah Stok Bahan");
        System.out.println("0. Log out");
        System.out.print("Choose with number : ");

        if (sc.hasNextInt()) {
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            if(choice == 1){
                Owner.cekHistory(sc);
            } else if (choice == 2){
                Owner.searchFruitSimple(sc);
            } else if (choice == 3){
                Owner.cekStokBahan(sc);
            } else if (choice==4){
                Owner.tambahStok(sc);
            } else if (choice == 0){
                Main.main(null);
            } else {
                System.out.println("Pilihan tidak valid.");
                homepageOwner(sc);
            }
        } else {
            System.out.println("Input harus berupa angka.");
            sc.nextLine();
            homepageOwner(sc);
        }
    }

    // Menerima Scanner sc
    public static void homepageCust(Scanner sc){
        System.out.println("---- WELCOME CUSTOMER ----");
        System.out.println("1. Make Order");
        System.out.println("2. Payment");
        System.out.println("0. Log out");
        System.out.print("Choose with number : ");

        if (sc.hasNextInt()) {
            int pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (pilihan == 1) {
                menuCust.menufruit(sc);       

            } else if (pilihan == 2){
                Payment.payment(sc);
            } else if (pilihan == 0){
                Main.main(null);
            } else {
                System.out.println("Pilihan tidak valid.");
                homepageCust(sc);
            }
        } else {
            System.out.println("Input harus berupa angka.");
            sc.nextLine();
            homepageCust(sc);
        }
    }
}
