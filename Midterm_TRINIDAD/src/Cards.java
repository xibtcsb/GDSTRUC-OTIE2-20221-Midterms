import java.util.Objects;

public class Cards {
    private String name;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return Objects.equals(name, cards.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
    public String toString() {
        return name;
    }
    public Cards(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}