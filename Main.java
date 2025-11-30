import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SELECT ROLE ===");
        System.out.println("1. Owner");
        System.out.println("2. Customer");
        System.out.print("Pilih: ");
        int role = sc.nextInt();

        if (role == 1) {
            OwnerFlow.startOwnerMenu();
        } else if (role == 2) {
            CustomerFlow.startCustomerFlow();

        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}

