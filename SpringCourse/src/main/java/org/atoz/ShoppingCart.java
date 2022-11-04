package org.atoz;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public ShoppingCart(Address address) {
        this.address = address;
    }
    public void checkout(String status) {
        // Before actual checking out operation, you may want:
        //   Logging --> ShoppingCart.logger()
        //   Authentication & Authorization
        //   Sanitizing Data
        // All above can be done in separate AOP classes!
        System.out.println("checkout shopping cart");
    }

    public int quantity() {
        return 5;
    }
}
