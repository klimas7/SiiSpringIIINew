package pl.sii.spring.core.annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HelloWorld {
    private String message;
    private String message2;

    public void print() {
        System.out.println("Your message: " + message + " : " + message2);
    }
}
