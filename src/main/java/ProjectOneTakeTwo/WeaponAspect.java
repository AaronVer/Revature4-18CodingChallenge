package ProjectOneTakeTwo;

import ProjectOneTakeTwo.Weapon;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
//@Component
//@Aspect

public class WeaponAspect {

    Logger logger = Logger.getLogger(Weapon.class);
    @Before("execution(* getWeapon*(..))")
    public void BeforeGettingWeapon(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature());
    }
}
