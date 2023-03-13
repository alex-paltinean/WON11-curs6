package interfaces;

public interface FoodProvider {
    boolean pay(double amount);
    String deliverFood();
    int getDeliveredQuantity();
}
