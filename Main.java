import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Market market = new Market();

        int choice;

        do {

            System.out.println("\nStock Trading Platform");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    market.viewMarket();
                    break;

                case 2:

                    market.viewMarket();

                    System.out.print("\nEnter Stock Number : ");
                    int buyStock = sc.nextInt();

                    System.out.print("Enter Quantity : ");
                    int buyQty = sc.nextInt();

                    if (buyQty <= 0) {
                        System.out.println("Enter a valid quantity.");
                    } else {
                        market.buyStock(buyStock, buyQty);
                    }

                    break;

                case 3:

                    market.viewPortfolio();

                    System.out.print("\nEnter Stock Number : ");
                    int sellStock = sc.nextInt();

                    System.out.print("Enter Quantity : ");
                    int sellQty = sc.nextInt();

                    if (sellQty <= 0) {
                        System.out.println("Enter a valid quantity.");
                    } else {
                        market.sellStock(sellStock, sellQty);
                    }

                    break;

                case 4:

                    market.viewPortfolio();
                    break;

                case 5:

                    System.out.println("\nThank You...");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

        sc.close();
    }
}