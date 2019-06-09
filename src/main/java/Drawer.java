import java.util.ArrayList;

public class Drawer {

    private Code code;
    private double price;
    private ArrayList<Product> products;

    public Drawer(Code code, double price) {
        this.code = code;
        this.price = price;
        this.products = new ArrayList<Product>();
    }

    public Code getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    public void add(Product product) {
        this.products.add(product);
    }

    public int getProductCount() {
        return this.products.size();
    }

    public void returnProduct(Product product) {
        this.products.remove(product);
    }
}
