package shop;

public class Tv extends Product {

    public Tv(String pname, int price, String resolution) {
        super(pname, price);
        this.resolution = resolution;
    }

    private String resolution;

    @Override
    public void printExtra() {
        System.out.println("해상도 : " + this.resolution);
    }

}
