package org.atoz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        System.out.println(cart.getAddress());
        cart.checkout("COMMITTED");
        cart.quantity();
    }
}
