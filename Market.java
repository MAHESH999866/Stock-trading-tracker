import java.util.ArrayList;

public class Market {

    ArrayList<Stock> stocks = new ArrayList<>();

    double wallet = 10000;

    public Market() {

        stocks.add(new Stock("Apple", 180));
        stocks.add(new Stock("Tesla", 250));
        stocks.add(new Stock("Google", 165));
        stocks.add(new Stock("Amazon", 145));
        stocks.add(new Stock("Microsoft", 420));

    }

    public void viewMarket() {

        System.out.println("\nAvailable Stocks\n");

        for (int i = 0; i < stocks.size(); i++) {

            Stock s = stocks.get(i);

            System.out.println((i + 1) + ". " + s.name + " - $" + s.price);

        }

        System.out.println("\nWallet Balance : $" + wallet);

    }

    public void buyStock(int number, int qty) {

        if (number < 1 || number > stocks.size()) {

            System.out.println("Invalid Stock Number.");
            return;

        }

        Stock s = stocks.get(number - 1);

        double amount = s.price * qty;

        if (amount > wallet) {

            System.out.println("Not enough balance.");
            return;

        }

        wallet = wallet - amount;

        s.quantity = s.quantity + qty;

        System.out.println("\nYou bought " + qty + " shares of " + s.name);
        System.out.println("Amount Paid : $" + amount);
        System.out.println("Wallet Balance : $" + wallet);

    }

    public void sellStock(int number, int qty) {

        if (number < 1 || number > stocks.size()) {

            System.out.println("Invalid Stock Number.");
            return;

        }

        Stock s = stocks.get(number - 1);

        if (qty > s.quantity) {

            System.out.println("You don't have enough shares.");
            return;

        }

        double amount = s.price * qty;

        s.quantity = s.quantity - qty;

        wallet = wallet + amount;

        System.out.println("\nYou sold " + qty + " shares of " + s.name);
        System.out.println("Amount Received : $" + amount);
        System.out.println("Wallet Balance : $" + wallet);

    }

    public void viewPortfolio() {

        boolean found = false;

        System.out.println("\nYour Portfolio\n");

        for (Stock s : stocks) {

            if (s.quantity > 0) {

                found = true;

                System.out.println(s.name);
                System.out.println("Shares : " + s.quantity);
                System.out.println("Current Value : $" + (s.quantity * s.price));
                System.out.println();

            }

        }

        if (!found) {

            System.out.println("No stocks purchased yet.");

        }

        System.out.println("Wallet Balance : $" + wallet);

    }

}