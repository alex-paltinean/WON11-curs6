package interfaces2;

public class Romanian implements Citizen {
    private long identifier;
    private int age;
    private String name;

    @Override
    public String getHomeCountry() {
        return "Romania";
    }

    @Override
    public long getIdentifier() {
        return identifier;
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
