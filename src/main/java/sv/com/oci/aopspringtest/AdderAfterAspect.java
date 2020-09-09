package sv.com.oci.aopspringtest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AdderAfterAspect
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(int SampleAdder+.*(..))")
    public void after(JoinPoint joinPoint)
    {
        logger.info("*************************");
        logger.info("After {}", joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* SampleAdder+.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result)
    {
        logger.info("*************************");
        logger.info("After returning {}, result was {}", joinPoint.getSignature(), result);
    }
}
