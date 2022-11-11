public class Packing {
    private String type;
    private String name;
    private double price;

    public Packing(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Packing{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
