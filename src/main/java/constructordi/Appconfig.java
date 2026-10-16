package constructordi;

import jdk.jfr.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public address Address(){
        return new address();
    }
    @Bean
    public Employee employee(address Address){
        return new Employee(Address);
    }

}
