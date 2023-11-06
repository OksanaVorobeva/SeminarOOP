package seminar1.vendingMachin;

import seminar1.domen.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private  int volume;

    private List<Product> products;

    public VendingMachine(int volume) {
        this.volume = volume;
        this.products = new ArrayList<>();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }


}
