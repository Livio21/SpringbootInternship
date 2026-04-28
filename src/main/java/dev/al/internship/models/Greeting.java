package dev.al.internship.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor
public class Greeting {
    private String greeting;
    private String language;

}
