package pl.sii.spring.core.circular;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.sii.spring.core.diff.Circle;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
public class DiffAutowiredTest {
    @Autowired
    private Circle shape;

    @Test
    public void startContextTest() {
        System.out.println(shape.description());
    }
}
