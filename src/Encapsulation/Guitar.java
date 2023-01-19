package Encapsulation;

public class Guitar {

    private double price;
    private long serialNo;
    private GuitarSpec spec;

    public Guitar(double price, long serialNo, GuitarSpec spec) {
        this.price = price;
        this.serialNo = serialNo;
        this.spec = spec;
    }

    public double getPrice() {
        return price;
    }

    public long getSerialNo() {
        return serialNo;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "price=" + price +
                ", serialNo=" + serialNo +
                ", spec=" + spec +
                '}';
    }
}
