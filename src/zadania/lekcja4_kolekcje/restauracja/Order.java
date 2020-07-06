package zadania.lekcja4_kolekcje.restauracja;

import java.util.List;

public class Order {
    private List<Dish> dishes;

    public Order(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        double dishesCost = PaymentService.calculateDishesSum(dishes);
        double serviceCost = PaymentService.calculateServiceCost(dishesCost);
        double totalCost = dishesCost + serviceCost;
        return String.format("Do zapłaty: %.2f, w tym:\n" +
                        "Koszt dań: %.2f \n" +
                        "Koszt obsługi: %.2f",
                totalCost, dishesCost, serviceCost);
    }
}
