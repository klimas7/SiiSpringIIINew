package pl.sii.spring.core.circular;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.sii.spring.core.diff.Shape;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
@TestPropertySource("classpath:test.properties")
public class ResourcesAsPropertiesTest {

    @Resource(name = "${my.bean.name}")
    private Shape shape;

    @Test
    public void startContextTest() {
        System.out.println(shape.description());
    }
}
