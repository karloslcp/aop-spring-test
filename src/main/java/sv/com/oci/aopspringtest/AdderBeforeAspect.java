package sv.com.oci.aopspringtest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AdderBeforeAspect
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* SampleAdder+.*(..))")
    public void logWarning()
    {
        logger.info("We are about to start!!!");
    }
}
