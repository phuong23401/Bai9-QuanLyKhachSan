public class Room {
    private Human human;
    private int days, price;
    private String name, kind;

    public Room() {
    }

    public Room(int price, String name, String kind) {
        this.price = price;
        this.name = name;
        this.kind = kind;
    }

    public Room(Human human, int days, int price, String kind) {
        this.human = human;
        this.days = days;
        this.price = price;
        this.kind = kind;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Room{" +
                "human=" + human +
                ", days=" + days +
                ", price=" + price +
                ", kind='" + kind + '\'' +
                '}';
    }
}
