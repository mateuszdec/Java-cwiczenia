package lekcja27_rekurencja.zad2;

class Cart {
    private static final int MAX_PRODUCTS = 10;
    private Product[] products = new Product[MAX_PRODUCTS];
    private int productsCount;

    void addProduct(Product product) {
        if (productsCount < MAX_PRODUCTS) {
            products[productsCount] = product;
            productsCount++;
        }
    }

    double totalCost() {
        return sumPrices(0);
    }

    private double sumPrices(int counter) {
        if (productsCount == 0)
            return 0;
        else if (counter < (productsCount - 1)) {
            return products[counter].getPrice() + sumPrices(++counter);
        } else {
            return products[counter].getPrice();
        }
    }
}
