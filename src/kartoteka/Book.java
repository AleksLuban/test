package kartoteka;

public class Book {
    public String name;
    public int date;
    public int cost;

    public Book(String name, int date, int cost) {
        this.name = name;
        this.date = date;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", cost=" + cost +
                '}';
    }
}
