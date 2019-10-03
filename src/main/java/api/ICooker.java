package api;

public interface ICooker {

    void getProductsFromWarehouse();
    void preparePizza();
    void deliverPizza();
    void preparePizza(int idPizza);
    void getProductsFromWarehouse(int quantityProducts);

}
