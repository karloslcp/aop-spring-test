package sv.com.oci.aopspringtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AopSpringTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AopSpringTestApplication.class, args);
		SampleAdder adder = context.getBean(SampleAdder.class);
		adder.add(5, 12);
	}

}
