package java.com.example.entity;

public class ShoppingCart {

    private Fruit[] fruits;

    public ShoppingCart(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Fruit fruit : fruits) {
            totalPrice += fruit.getPricePerKg();
        }
        return totalPrice;
    }

}
