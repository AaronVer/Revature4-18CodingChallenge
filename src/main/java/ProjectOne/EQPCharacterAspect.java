package ProjectOne;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;
import ProjectOne.EQPCharacterAspect;

@Component
@Aspect
public class EQPCharacterAspect {

    Logger logger = Logger.getLogger(EQPCharacter.class);

    @Before("execution(* getEQPCharacter*(..))")
        public void BeforeGettingEQPCharacter(JoinPoint joinPoint){
            logger.info(joinPoint.getSignature());
        }
}
