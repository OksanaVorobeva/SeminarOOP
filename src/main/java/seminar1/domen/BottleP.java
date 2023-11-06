package seminar1.domen;

public class BottleP extends Product{

    private int volume;

    public BottleP(int productID, String productName, String productCategory, double price,int volume) {
        super(productID, productName, productCategory, price);
        this.volume=volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + super.getProductID() +
                ", productName='" + super.getProductName() + '\'' +
                ", productCategory='" + super.getProductCategory()+ '\'' +
                ", price=" + super.getPrice() +
                '}'+volume;
    }


}
