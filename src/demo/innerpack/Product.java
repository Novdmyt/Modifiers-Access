package demo.innerpack;

// Клас-модель об'єкта.
public class Product {


    // Модифікатори доступу private.
    private String name; // Властивості об'єкта (змінні).
    private int qnty; // Властивості об'єкта (змінні).


    protected Product(){// Конструктори.

    }

    protected Product(String name, int qnty){// Конструктори.
        this.name = name;
        this.qnty = qnty;
    }
    // getters and setters.
    protected String getName(){
        return name;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected int getQnty(){
        return qnty;
    }
    protected void setQnty(int qnty){
        this.qnty = qnty;
    }






}
