package org.example.project1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreation {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
