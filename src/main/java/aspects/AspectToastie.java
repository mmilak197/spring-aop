package aspects;

import api.IToastie;
import impl.Toastie;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AspectToastie {

    @DeclareParents(value = "api.ICooker+", defaultImpl = Toastie.class)
    public static IToastie toastie;


}
