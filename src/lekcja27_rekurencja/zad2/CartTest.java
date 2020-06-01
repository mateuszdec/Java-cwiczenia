package lekcja27_rekurencja.zad2;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("mleko", 1));
        cart.addProduct(new Product("czekolada", 2));
        cart.addProduct(new Product("jogurt", 3));

        System.out.println(cart.totalCost());
    }
}
