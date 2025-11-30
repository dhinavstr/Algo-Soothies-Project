import java.util.Scanner;

public class CustomerFlow {

    public static void startCustomerFlow() {

        Scanner in = new Scanner(System.in);

        String[] buahMenu = {"Mango", "Strawberry", "Banana", "Blueberry", "Watermelon"};
        int[] buahHarga = {15000, 17000, 12000, 18000, 10000};

        String[] sizeMenu = {"Regular", "Large"};
        int[] sizeHarga = {0, 5000};

        String[] manisMenu = {"No Sugar", "Less Sugar", "Normal", "Extra Sugar"};
        int[] manisHarga = {0, 1000, 2000, 3000};

        String[] esMenu = {"No Ice", "Less Ice", "Normal", "Extra Ice"};
        int[] esHarga = {0, 1000, 2000, 3000};

        String[] milkMenu = {"Oat Milk", "Low Fat Milk", "Full Cream Milk", "Almond Milk", "Yogurt", "No Base Milk"};
        int[] milkHarga = {5000, 4000, 3000, 6000, 7000, 0};

        String[] toppingMenu = {"Chia Seed", "Whip Cream", "Jelly", "No Topping"};
        int[] toppingHarga = {3000, 4000, 2000, 0};


        // ===================== PILIH BUAH ======================
        System.out.println("\n=== PILIH BUAH ===");
        for (int i = 0; i < buahMenu.length; i++) {
            System.out.println((i+1) + ". " + buahMenu[i] + " (Rp " + buahHarga[i] + ")");
        }
        System.out.print("Masukkan pilihan: ");
        int pilihBuah = in.nextInt() - 1;

        if (pilihBuah < 0 || pilihBuah >= buahMenu.length) {
            System.out.println("Pilihan buah tidak valid!");
            return;
        }

        String buah = buahMenu[pilihBuah];
        int hargaBuah = buahHarga[pilihBuah];


        // ===================== PILIH SIZE ======================
        System.out.println("\n=== PILIH SIZE ===");
        for (int i = 0; i < sizeMenu.length; i++) {
            System.out.println((i+1) + ". " + sizeMenu[i] + " (Rp " + sizeHarga[i] + ")");
        }
        System.out.print("Masukkan pilihan: ");
        int pilihSize = in.nextInt() - 1;

        if (pilihSize < 0 || pilihSize >= sizeMenu.length) {
            System.out.println("Pilihan size tidak valid!");
            return;
        }

        String size = sizeMenu[pilihSize];
        int hargaSize = sizeHarga[pilihSize];


        // ===================== PILIH MANIS ======================
        System.out.println("\n=== PILIH TINGKAT KEMANISAN ===");
        for (int i = 0; i < manisMenu.length; i++) {
            System.out.println((i+1) + ". " + manisMenu[i] + " (Rp " + manisHarga[i] + ")");
        }
        System.out.print("Masukkan pilihan: ");
        int pilihManis = in.nextInt() - 1;

        if (pilihManis < 0 || pilihManis >= manisMenu.length) {
            System.out.println("Pilihan manis tidak valid!");
            return;
        }

        String manis = manisMenu[pilihManis];
        int hargaManis = manisHarga[pilihManis];


        // ===================== PILIH ES ======================
        System.out.println("\n=== PILIH JUMLAH ES ===");
        for (int i = 0; i < esMenu.length; i++) {
            System.out.println((i+1) + ". " + esMenu[i] + " (Rp " + esHarga[i] + ")");
        }
        System.out.print("Masukkan pilihan: ");
        int pilihEs = in.nextInt() - 1;

        if (pilihEs < 0 || pilihEs >= esMenu.length) {
            System.out.println("Pilihan es tidak valid!");
            return;
        }

        String es = esMenu[pilihEs];
        int hargaEs = esHarga[pilihEs];


        // ===================== PILIH MILK ======================
        System.out.println("\n=== PILIH BASE MILK ===");
        for (int i = 0; i < milkMenu.length; i++) {
            System.out.println((i+1) + ". " + milkMenu[i] + " (Rp " + milkHarga[i] + ")");
        }

        System.out.print("Masukkan pilihan: ");
        int pilihMilk = in.nextInt() - 1;

        if (pilihMilk < 0 || pilihMilk >= milkMenu.length) {
            System.out.println("Pilihan milk tidak valid!");
            return;
        }

        String milk = milkMenu[pilihMilk];
        int hargaMilk = milkHarga[pilihMilk];


        // ===================== PILIH TOPPING ======================
        System.out.println("\n=== PILIH TOPPING ===");
        for (int i = 0; i < toppingMenu.length; i++) {
            System.out.println((i+1) + ". " + toppingMenu[i] + " (Rp " + toppingHarga[i] + ")");
        }

        System.out.print("Masukkan pilihan: ");
        int pilihTopping = in.nextInt() - 1;

        if (pilihTopping < 0 || pilihTopping >= toppingMenu.length) {
            System.out.println("Pilihan topping tidak valid!");
            return;
        }

        String topping = toppingMenu[pilihTopping];
        int hargaTopping = toppingHarga[pilihTopping];


        // ===================== HITUNG TOTAL ======================
        int subtotal = hargaBuah + hargaSize + hargaManis + hargaEs + hargaMilk + hargaTopping;
        double ppn = subtotal * 0.11;
        double total = subtotal + ppn;


        // ===================== REVIEW PESANAN ======================
        System.out.println("\n=== REVIEW PESANAN ===");
        System.out.println("Buah      : " + buah);
        System.out.println("Size      : " + size);
        System.out.println("Manis     : " + manis);
        System.out.println("Es        : " + es);
        System.out.println("Base Milk : " + milk);
        System.out.println("Topping   : " + topping);

        System.out.println("\nSubtotal  : Rp " + subtotal);
        System.out.println("PPN 11%   : Rp " + (int)ppn);
        System.out.println("Total     : Rp " + (int)total);

        System.out.println("\nTerima kasih sudah memesan!");
    }
}
