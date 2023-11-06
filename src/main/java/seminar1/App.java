package seminar1;

import seminar1.domen.BottleP;
import seminar1.domen.Product;
import seminar1.vendingMachin.VendingMachine;

public class App {
    public static void main(String[] args) {
        Product item1=new Product(1,"Lays","Чипсы",59);
        item1.setPrice(100);
        Product item2=new BottleP(2,"Cola","Water",70,500);

        VendingMachine vendingMachine = new VendingMachine(300);
        vendingMachine.addProduct(item1);
        vendingMachine.addProduct(item2);
        vendingMachine.addProduct(new Product(3,"масло","масло",60));
        vendingMachine.addProduct(new BottleP(2,"Cola","Water",400,1500));

        for (Product prod: vendingMachine.getProducts()) {
            System.out.println(prod);
        }

    }
}
