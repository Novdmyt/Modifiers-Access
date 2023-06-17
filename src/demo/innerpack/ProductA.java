package demo.innerpack;

import demo.utils.Rounder;

public class ProductA extends Product {
    double price;
    String sales;

    public ProductA(String name, int quantity, double price){
        super(name, quantity);//"super(name, quantity);"
        // Використовується в контексті наслідування класів
        // і представляє виклик конструктора батьківського
        // класу з вказаними аргументами.
        //Product" і має конструктор з
        // параметрами "name" і "quantity", то виклик
        // "super(name, quantity);" виконає конструктор
        // "Product(name, quantity);" і передасть значення
        // "name" і "quantity" у конструктор батьківського
        // класу "Product".
        this.price = price;
    }
public String infoCaseOne(){
        sales = Rounder.roundValue(calculateTotalSale(getQnty(), price));
        return "\nCASE # 1" +
                "\nProduct: " + getName() +
                "\nQuantity (kg): " + getQnty() +
                "\nSales (USD): " + sales;

    }

    String infoCaseTwo() {
        sales = Rounder.roundValue(calculateTotalSale(getQnty(), price));
        return "\nCASE # 2" +
                "\nProduct: " + getName() +
                "\nQuantity (kg): " + getQnty() +
                "\nSales (USD): " + sales;
    }

    private double calculateTotalSale(int quota, double price){
        return quota * price;
    }


}
