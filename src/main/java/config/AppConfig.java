package config;

import api.ICooker;
import api.IToastie;
import aspects.AspectToastie;
import aspects.Communicate;
import aspects.WarehouseController;
import impl.Cooker;
import impl.CookerAsistant;
import impl.Toastie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aspects")
@EnableAspectJAutoProxy //wlaczenie aspektow Springowych
public class AppConfig {

    @Bean
    public IToastie toastie() {
        return new Toastie();
    }

    @Bean
    public AspectToastie aspectToastie() {
        return new AspectToastie();
    }

    @Bean
    @Qualifier("cooker")
    public ICooker cooker(){
        return new Cooker();
    }

    @Bean
    @Qualifier("cooker_asistant")
    public ICooker cookerAsistant() {
        return new CookerAsistant();
    }

    @Bean
    public Communicate communicate() {
        return new Communicate();
    }

    @Bean
    public WarehouseController warehouseController() {
        return new WarehouseController();
    }

    /*@Bean
    @Qualifier("pomocnik_kucharza")*/
}
