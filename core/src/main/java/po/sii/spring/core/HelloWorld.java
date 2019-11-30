package po.sii.spring.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HelloWorld {
    private String message;

    public void print() {
        System.out.println("Your message: " + message);
    }
}
