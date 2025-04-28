import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Can Joan", 8));
        restaurants.add(new Restaurant("El Celler", 10));
        restaurants.add(new Restaurant("Can Joan", 9));
        restaurants.add(new Restaurant("Can Joan", 8));

        System.out.println("List of Restaurants:");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}