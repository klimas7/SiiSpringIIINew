package pl.sii.spring.core;

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

    public void print() {
        System.out.println("Your message: " + message);
    }
}
