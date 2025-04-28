import java.util.Objects;

public class Restaurant {
    private String name;
    private int points;

    public Restaurant(String nom, int points) {
        this.name = nom;
        this.points = points;
    }

    public String getNom() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant that = (Restaurant) obj;
        return points == that.points && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, points);
    }

    @Override
    public String toString() {
        return name + " - Points: " + points;
    }
}