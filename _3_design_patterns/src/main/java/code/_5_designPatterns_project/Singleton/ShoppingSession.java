package code._5_designPatterns_project.Singleton;

public class ShoppingSession {
    public ShoppingSession() {
    }

    public void addProductToCart(Product product, int pieces) {
        ShoppingCart.getInstance().addToCart(product, pieces);
    }

    public void checkout() {
        ShoppingCart.getInstance().checkout();
    }
}
