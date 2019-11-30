package pl.sii.spring.core.circular;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.sii.spring.core.diff.Circle;

import javax.annotation.Resource;
import javax.inject.Inject;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
public class DiffInjectionTest {
    @Inject
    private Circle shape;

    @Test
    public void startContextTest() {
        System.out.println(shape.description());
    }
}
