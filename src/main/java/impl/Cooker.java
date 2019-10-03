package impl;

import api.ICooker;

public class Cooker implements ICooker {

    public void getProductsFromWarehouse() {
        System.out.println("Kucharz pobiera skladniki");
        //throw new IllegalAccessError();
    }

    public void preparePizza() {
        System.out.println("Kucharz przygotowuje pizze");
    }

    public void deliverPizza() {
        System.out.println("Kucharz wydaje pizze");
    }

    public void preparePizza(int idPizza) {
        System.out.println("Kucharz przygotowuje pizze o id " + idPizza);
    }

    public void getProductsFromWarehouse(int quantityProducts) {
        System.out.println("Kucharz pobiera " + quantityProducts + " skladnikow");
    }
}
