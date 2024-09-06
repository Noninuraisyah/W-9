package package1.app;

import package1.data.*;

public class App {

    public static void main(String[] args) {
        // var location = new Location(); // error
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }

}
