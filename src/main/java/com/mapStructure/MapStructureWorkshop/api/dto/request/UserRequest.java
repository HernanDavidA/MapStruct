package com.mapStructure.MapStructureWorkshop.api.dto.request;

import com.mapStructure.MapStructureWorkshop.utils.enums.Rol;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotBlank(message = "Username required")
    @Size(min = 0, max = 100, message = "Username should have 1 charactert at least")
    public String username;

    @NotBlank(message = "Password required")
    @Size(min = 0, max = 100, message = "Password should have 1 charactert at least")
    public String password;

    @NotBlank(message = "Password required")
    @Email
    @Size(min = 0, max = 100, message = "Write a validate email")
    public String email;

    @NotBlank(message = "Full name required")
    @Size(min = 0, max = 100, message = "Fullname should have 1 charactert at least")
    public String fullName;

    @NotBlank(message = "Full name required")
    @Size(min = 0, max = 100, message = "Fullname should have 1 charactert at least")
    public Rol role;


    
}
