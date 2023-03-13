package interfaces2;

public class Rebel implements Person {
    private int age;
    private String name;

    public Rebel(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
