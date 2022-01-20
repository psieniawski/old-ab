package orsn.ab.dummya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import orsn.ab.dummya.DummyAImpl;

@Configuration
public class DummyALocalServiceAutoConfiguration {

    @Bean
    public DummyA dummyA(){
        return new DummyAImpl();
    }

}
