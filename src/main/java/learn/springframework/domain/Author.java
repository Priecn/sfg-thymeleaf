package learn.springframework.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private String image;
}
