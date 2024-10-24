package develhope.wms.model;
//create a class under the name of Cart  in the package develhope.wms.model
//add the following as private fields
//items of type List<CartItems>.
//user of type User.
//create a constructor for the class
//create getters and setters for all the fields
import java.util.List;

public class WarehouseManagementSystem {
    public static void main(String[] args){}
}
public class Cart {

    // Private fields
    private List<CartItems> items;
    private User user;

    // Constructor
    public Cart(List<CartItems> items, User user) {
        this.items = items;
        this.user = user;
    }

    // Getters
    public List<CartItems> getItems() {
        return items;
    }

    public User getUser() {
        return user;
    }

    // Setters
    public void setItems(List<CartItems> items) {
        this.items = items;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
