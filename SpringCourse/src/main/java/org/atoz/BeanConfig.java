package org.atoz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// These annotations can also be applied to Application class
// and there is no need of this BeanConfig class.
@Configuration
@ComponentScan(basePackageClasses = BeanConfig.class)
public class BeanConfig {
    @Bean
    public Address getAddress() {
        return new Address();
    }
}
