package interfaces;

public class KFC implements FoodProvider {
    private static double pricePerItem = 20;
    private int quantity = 0;
    private double amountToPay = 0;

    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("KFC was payed " + amount);
            return true;
        }
        return false;
    }

    public String deliverFood() {
        quantity++;
        amountToPay += pricePerItem;
        return "crispy";
    }

    public int getDeliveredQuantity() {
        return quantity;
    }
}
