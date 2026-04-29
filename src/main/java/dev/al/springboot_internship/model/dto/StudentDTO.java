package dev.al.springboot_internship.model.dto;

import lombok.Data;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private String birthDate;
    private String phoneNumber;
    private int points;
}
