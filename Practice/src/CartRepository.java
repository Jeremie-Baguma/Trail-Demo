import java.util.List;
import java.util.stream.Collectors;

public class CartRepository {
    private static List<SoldProduct> soldProducts;

    public CartRepository(List<SoldProduct> soldProducts) {
        this.soldProducts = soldProducts;
    }

    // Method to get bought items for a user
    public List<SoldProduct> getUserBoughtItems(String username) {
        return soldProducts.stream()
                .filter(soldProduct -> soldProduct.getUsername().equals(username))
                .collect(Collectors.toList());
    }

    public class CartService {
        private CartRepository cartRepository;

        public CartService(CartRepository cartRepository) {
            this.cartRepository = cartRepository;
        }

        // Method to fetch bought items for a user
        public List<SoldProduct> fetchUserBoughtItems(String username) {
            return cartRepository.getUserBoughtItems(username);
        }
    }
    public class SoldProduct {
        private String username;
        private String productName;

        // Constructor, getters, and other methods

        public String getUsername() {
            return username;
        }
    }
    public class Main {
        public void main(String[] args) {
            // Assuming soldProducts is a list of SoldProduct objects
            CartRepository cartRepository = new CartRepository(soldProducts);
            CartService cartService = new CartService(cartRepository);

            String username = "JeremieB";
            List<SoldProduct> boughtItems = cartService.fetchUserBoughtItems(username);

            // Display or process the bought items for the user
        }
    }
}