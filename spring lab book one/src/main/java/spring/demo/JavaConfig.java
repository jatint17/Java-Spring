package spring.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:employee.properties")
@ComponentScan("spring.demo")
@Configuration
public class JavaConfig 
{

}
