package interfaces;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.setFoodSource(new McDonalds());

        company.sendFoodToEmployees();

        company.makePayment();
    }
}
