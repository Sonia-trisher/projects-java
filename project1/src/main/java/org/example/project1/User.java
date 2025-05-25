package org.example.project1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
//TABLE
@Entity
//GETTER ANDA SEETTER AND HT
@Data
@Table(name = "user table")
//CONSTRUCTOR
@AllArgsConstructor
@NoArgsConstructor
public class User {
//    PRIMARY KEY
    @Id
//    GENERATE LIKE SERIA KUGIRANGO BIJYE BYIZAN
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private String PhoneNumber;
    @CreationTimestamp
    private LocalDate createAt;
    @UpdateTimestamp
    private LocalDate updateAt;
    public User(String firstName, String lastName, String email, String PhoneNumber, LocalDate createAt, LocalDate updateAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
}
