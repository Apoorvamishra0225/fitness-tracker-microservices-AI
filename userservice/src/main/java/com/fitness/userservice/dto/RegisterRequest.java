package com.fitness.userservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;
    private String keycloakId;
    @NotBlank(message = "Password not blank")
    @Size(min = 6, message = "Password must be atleast 6 charachters")
    private String password;
    private String firstName;
    private String lastName;

}
