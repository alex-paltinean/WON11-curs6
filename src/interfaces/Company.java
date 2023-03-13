package interfaces;

public class Company {
    private FoodProvider foodSource;
    private int numberOfEmployees = 10;

    public void setFoodSource(FoodProvider foodSource) {
        this.foodSource = foodSource;
    }

    public void sendFoodToEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(foodSource.deliverFood());
        }
    }

    public void makePayment() {
        foodSource.pay(100);
    }
}
