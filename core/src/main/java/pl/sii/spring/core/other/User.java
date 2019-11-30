package pl.sii.spring.core.other;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private String email;
}
