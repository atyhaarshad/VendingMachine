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
        return this.price;
    }


    public void add(Product product) {
        this.products.add(product);
    }

    public int getProductCount() {
        return this.products.size();
    }

    public Product removeProduct() {
        return this.products.remove(0);
    }

    public Product returnProduct(){
        return this.products.get(0);
    }



}
