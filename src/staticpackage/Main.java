package staticpackage;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane();

        a1.setType("Type 1");
        a2.setType("Type 2");
        System.out.println(a1.getType());

        a1.setGravityCoefficient(1.2);
        a2.setGravityCoefficient(3.1);
        System.out.println(a1.getGravityCoefficient());
    }

}
