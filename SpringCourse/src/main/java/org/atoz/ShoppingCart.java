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
    public void checkout() {
        System.out.println("checkout shopping cart");
    }
}
