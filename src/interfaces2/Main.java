package interfaces2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] abductedByAliens = new Person[10];
        Citizen[] citizensOfHonor = new Citizen[10];
        Employee[] employeesOfTheMonth = new Employee[10];

        Rebel rebel = new Rebel(18, "Mike");
        abductedByAliens[0] = rebel;
//        citizensOfHonor[0] = rebel; -- compile error
//        employeesOfTheMonth[0] = rebel; -- compile error

        RomanianOmvWorker olivia = new RomanianOmvWorker();
        abductedByAliens[1] = olivia;
        citizensOfHonor[1] = olivia;
        employeesOfTheMonth[1] = olivia;


        abductedByAliens[0].getAge();
        abductedByAliens[1].getAge();

        citizensOfHonor[1].getHomeCountry();

        abductedByAliens[2] = new Romanian();
    }
}
