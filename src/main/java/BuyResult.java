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

    public boolean isSuccessful() {
        return successful;
    }

}
