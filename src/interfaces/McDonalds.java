package interfaces;

public class McDonalds implements FoodProvider{
    private static double pricePerItem = 15;
    private int quantity = 0;
    private double amountToPay = 0;

    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("McDonalds was payed " + amount);
            return true;
        }
        return false;
    }

    public String deliverFood() {
        quantity++;
        amountToPay += pricePerItem;
        return "burger";
    }

    public int getDeliveredQuantity() {
        return quantity;
    }
}
