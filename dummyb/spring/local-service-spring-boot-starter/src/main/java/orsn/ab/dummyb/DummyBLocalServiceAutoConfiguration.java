package orsn.ab.dummyb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyBLocalServiceAutoConfiguration {

    @Bean
    public DummyB dummyB() {
        return new DummyBImpl();
    }

}
