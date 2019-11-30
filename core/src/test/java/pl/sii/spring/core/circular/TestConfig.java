package pl.sii.spring.core.circular;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans( {
        @ComponentScan("pl.sii.spring.core.circular"),
        @ComponentScan("pl.sii.spring.core.diff")})
public class TestConfig {
}
