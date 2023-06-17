package demo.innerpack;
import demo.utils.Rounder;

public class ProductB {
    Product product;
    double price;
    String sales;

    public void setData(String name,int quantity, double price){
        product = new Product();
        product.setName(name);
        product.setQnty(quantity);
        this.price = price;
    }
    public String infoCaseOne() {
        sales = Rounder.roundValue(calculateTotalSale(product.getQnty(),
                price));

        return "\nCASE # 1" +
                "\nProduct: " + product.getName() +
                "\nQuantity (kg): " + product.getQnty() +
                "\nSales (USD): " + sales;
    }
    String infoCaseTwo() {
        sales = Rounder.roundValue(calculateTotalSale(
                product.getQnty(), price));
        return "\nCASE # 2" +
                "\nProduct: " + product.getName() +
                "\nQuantity (kg): " + product.getQnty() +
                "\nSales (USD): " + sales;
    }
    private double calculateTotalSale(int quota, double price) {
        return quota * price;
    }
}
