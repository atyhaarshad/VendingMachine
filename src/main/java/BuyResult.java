import java.util.List;

public class BuyResult {

    private Product product;
    private boolean successful;
    private List<Coin> coinsReturned;

    public BuyResult(Product product, boolean successful, List<Coin> coinsReturned) {
        this.product = product;
        this.successful = successful;
        this.coinsReturned = coinsReturned;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public List<Coin> getCoinsReturned() {
        return coinsReturned;
    }

    public void setCoinsReturned(List<Coin> coinsReturned) {
        this.coinsReturned = coinsReturned;
    }
}
