package aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WarehouseController {

    @Pointcut("execution(* impl.Cooker.getProductsFromWarehouse(..))") //zdefiniowanie punktu przeciecia, wygodne jesli bedzie uzywany w
    // wielu miejscach
    public void pointCut() {

    }

    @Before("pointCut()")
    public void checkProcuctsWarehouse() {
        System.out.println("Sprawdzam stan magazynu");
    }

    @AfterThrowing("execution(* impl.Cooker.getProductsFromWarehouse(..))")
    public void signalMissingInWarehouse() {
        System.out.println("Braki w magazynie!!!");
    }
}
