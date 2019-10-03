package main;

import api.ICooker;
import api.IToastie;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICooker cooker = (ICooker) context.getBean("cooker");
        /*cooker.getProductsFromWarehouse(1);
        cooker.preparePizza(2);
        cooker.deliverPizza();
        ICooker asistant = (ICooker) context.getBean("cookerAsistant");
        asistant.getProductsFromWarehouse();*/

        ((IToastie)cooker).prepareToastie();
    }
}
