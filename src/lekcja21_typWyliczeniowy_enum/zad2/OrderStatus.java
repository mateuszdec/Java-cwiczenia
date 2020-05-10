package lekcja21_typWyliczeniowy_enum.zad2;

enum OrderStatus {
    NEW("Nowe"),
    PAID("Opłacone"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczone"),
    CANCELLED("Anulowane");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
