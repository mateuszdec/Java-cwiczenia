package metody_i_konstruktory4.zad3;

public class Offer {
    Product product;
    double price;
    boolean special;

    public Offer(Product prod, double pr, boolean s) {
        this.product = prod;
        this.price = pr;
        this.special = s;
    }

    void printInfo() {
        System.out.println(product.name + " "
                + product.producer + " "
                + price + "zł, "
                + "oferta specjalna? " + special);
    }
}
