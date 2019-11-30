package pl.sii.spring.core.circular;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.sii.spring.core.diff.Circle;
import pl.sii.spring.core.diff.Shape;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
public class DiffAutowiredTest {
    /*
     * - Type
     * - Qualifier
     * - name
     */
    @Autowired
    @Qualifier(value = "triangle")
    private Shape square;

    @Test
    public void startContextTest() {
        System.out.println(square.description());
    }
}
