package sv.com.oci.aopspringtest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdderBeforeAspect
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* SampleAdder+.*(..))")
    public void logWarning(JoinPoint joinPoint)
    {
        logger.info("Before {} execution", joinPoint);
        logger.info("Target: {}", joinPoint.getTarget());
        logger.info("Static Part: {}", joinPoint.getStaticPart());
        logger.info("Args: {}", joinPoint.getArgs());
        logger.info("Kind: {}", joinPoint.getKind());
        logger.info("Signature: {}", joinPoint.getSignature());
        logger.info("Source Location: {}", joinPoint.getSourceLocation());
        logger.info("This: {}", joinPoint.getThis());
        logger.info("Class: {}", joinPoint.getClass());
    }
}
