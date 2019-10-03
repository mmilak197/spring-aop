package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Communicate {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt) {
    }

    @Pointcut("target(api.ICooker)")
    public void pointcutTarget() {
    }

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation){
    }

    @Pointcut("within(impl.Cooker)")
    public void pointcutWithin() {
    }

    /*@Before("pointcutInt(arg)")
    public void porada(int arg){
        System.out.println("PORADA " + arg);
    }*/

    /*@Before("pointcutTarget()")
    public void porada() {
        System.out.println("PORADA dla metod interfejsu ICooker");
    }*/

    @Before("pointcutTargetAnnotation(anno)")
    public void porada(Deprecated anno) {
        System.out.println("PORADA " + anno);
    }

    @Before("pointcutWithin()")
    public void porada() {
        System.out.println("PORADA within");
    }

    @After("execution(* impl.Cooker.getProductsFromWarehouse(..))")
    public void informAboutGetProductsFromWarehouse() {
        System.out.println("Pobrano skladniki");
    }

    @Around("execution(* impl.Cooker.deliverPizza(..))") //wykonanie akcji przed i po metodzie
    public void deliveryPizza(ProceedingJoinPoint joinPoint /*umożliwia sterowanie przed jak i po wykonaniu metody*/) {
        try {
            System.out.println("KOMUNIKUJEMY ZE PIZZA JEST GOTOWA");
            joinPoint.proceed();
            System.out.println("KOMUNIKUJEMY ZE WYDANO PIZZE");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
