package code._5_designPatterns_project.Singleton;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ShoppingCart {
    private static ShoppingCart INSTANCE;
    private static List<Pair<Product, Integer>> cart;

    private ShoppingCart() {
        cart = new ArrayList();
    }

    void addToCart(Product product, int pieces) {
        cart.add(new Pair(product, pieces));
    }

    void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout");
        } else {
            System.out.println("checkout:");
            Iterator var1 = cart.iterator();

            while(var1.hasNext()) {
                Pair<Product, Integer> cartItem = (Pair)var1.next();
                PrintStream var10000 = System.out;
                String var10001 = ((Product)cartItem.getKey()).productName;
                var10000.println(var10001 + " (" + ((Product)cartItem.getKey()).manufacturer + "): " + cartItem.getValue() + " pieces");
            }

            cart.clear();
        }

    }

    static ShoppingCart getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ShoppingCart();
        }

        return INSTANCE;
    }
}