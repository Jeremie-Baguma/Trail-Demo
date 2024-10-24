import java.math.BigDecimal;
import java.util.ArrayList;
//

class Product {
    private String name;
    private BigDecimal price;
    private int stock;
    private BigDecimal discount;

    public Product(String name, BigDecimal price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.discount = BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price.subtract(price.multiply(discount));
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }
}


class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalPrice() {
        return product.getPrice().multiply(BigDecimal.valueOf(quantity));
    }

    @Override
    public String toString() {
        return product.getName() + " - Quantity: " + quantity + " - Price per unit: " + product.getPrice() +
                " - Total: " + getTotalPrice();
    }
}


class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        if (product.getStock() < quantity) {
            System.out.println("Not enough stock for " + product.getName());
            return;
        }
        cartItems.add(new CartItem(product, quantity));
        product.setStock(product.getStock() - quantity);
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (CartItem item : cartItems) {
                System.out.println(item);
            }
        }
    }

    public BigDecimal calculateTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (CartItem item : cartItems) {
            total = total.add(item.getTotalPrice());
        }
        return total;
    }

    public void removeFromCart(Product product) {
        cartItems.removeIf(item -> item.getProduct().equals(product));
    }
}


public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop", new BigDecimal("1000"), 10);
        Product phone = new Product("Phone", new BigDecimal("600"), 15);
        Product tablet = new Product("Tablet", new BigDecimal("400"), 20);


        phone.setDiscount(new BigDecimal("0.10")); // 10% discount on phone


        ShoppingCart cart = new ShoppingCart();


        cart.addToCart(laptop, 2);
        cart.addToCart(phone, 1);
        cart.addToCart(tablet, 3);


        System.out.println("Cart contents:");
        cart.viewCart();


        System.out.println("\nTotal cost: " + cart.calculateTotal());


        cart.removeFromCart(phone);


        System.out.println("\nCart contents after removing phone:");
        cart.viewCart();


        System.out.println("\nTotal cost after removal: " + cart.calculateTotal());
    }
}
