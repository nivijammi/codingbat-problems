package codecademy;

public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + (price * tax);
        return totalPrice;
    }

    //toString() method
    public String toString() {
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    // main method
    public static void main(String[] args) {
        // T1 - set the inital product
        Store lemonadeStand = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);

        //T2 - Increase in price of the product
        lemonadeStand.increasePrice(1.5);
        cookieShop.increasePrice(1.5);

        // T3 - get product price including tax
        System.out.println(lemonadeStand.getPriceWithTax());

        //toString() method

        System.out.println(lemonadeStand);
        System.out.println(cookieShop);


        // T4 - Get the price with increased amount including tax


    }
}
