package java.com.example;

import java.com.example.entity.Fruit;
import java.com.example.entity.ShoppingCart;

public class onsiteTest {
        public static void main(String[] args) {
            Fruit apple = new Fruit("Apple", 8);
            Fruit strawberry = new Fruit("Strawberry", 13);
            Fruit mango = new Fruit("Mango", 20);

            // 顾客 A
            Fruit[] customerAFruits = {apple, strawberry};
            ShoppingCart customerAShoppingCart = new ShoppingCart(customerAFruits);
            double totalCustomerAPrice = customerAShoppingCart.calculateTotalPrice();
            System.out.println("Customer A total price: " + totalCustomerAPrice);

            // 顾客 B
            Fruit[] customerBFruits = {apple, strawberry, mango};
            ShoppingCart customerBShoppingCart = new ShoppingCart(customerBFruits);
            double totalCustomerBPrice = customerBShoppingCart.calculateTotalPrice();
            System.out.println("Customer B total price: " + totalCustomerBPrice);

            // 顾客 C
            Fruit[] customerCFruits = {apple, strawberry, mango};
            ShoppingCart customerCShoppingCart = new ShoppingCart(customerCFruits);
            double totalCustomerCPrice = customerCShoppingCart.calculateTotalPrice() * 0.8; // 草莓8折
            System.out.println("Customer C total price: " + totalCustomerCPrice);

            // 顾客 D
            Fruit[] customerDFruits = {apple, strawberry, mango};
            ShoppingCart customerDShoppingCart = new ShoppingCart(customerDFruits);
            double totalCustomerDPrice = customerDShoppingCart.calculateTotalPrice();
            if (totalCustomerDPrice >= 100) {
                totalCustomerDPrice -= 10; // 满100减10
            }
            System.out.println("Customer D total price: " + totalCustomerDPrice);
        }


}
