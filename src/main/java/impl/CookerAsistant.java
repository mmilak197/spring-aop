package impl;

import api.ICooker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Deprecated
public class CookerAsistant implements ICooker {

    @Autowired
    @Qualifier("cooker_asistant")
    private ICooker cooker;

    public void getProductsFromWarehouse() {
        System.out.println("Pomocnik pobiera skladniki z magazynu");
    }

    public void getProductsFromWarehouse(int quantityProducts) {
        System.out.println("Pomocnik pobiera " + quantityProducts + " skladnikow z magazynu");
    }

    public void preparePizza() {
        System.out.println("Pomocnik oddelegowuje przygotowanie do kucharza");
        cooker.preparePizza();
    }

    public void preparePizza(int idPizza) {
        System.out.println("Pomocnik oddlegowuje przygotowanie pizzy o id " + idPizza + " do kucharza");
        cooker.preparePizza(idPizza);
    }

    public void deliverPizza() {
        System.out.println("Pomocnik wydaje pizze");
    }
}
