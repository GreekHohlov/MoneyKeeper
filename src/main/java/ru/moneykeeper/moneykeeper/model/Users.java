package ru.moneykeeper.moneykeeper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(name = "uniqueLogin", columnNames = "login"),
        @UniqueConstraint(name = "uniqueEmail", columnNames = "email")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "users_seq", allocationSize = 1)
public class Users extends GenericModel{
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "phone")
    private String phone;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "change_password_token")
    private String changePasswordToken;
    @OneToMany(mappedBy = "users")
    private Set<Expenses> expansesName;
    @OneToMany(mappedBy = "users")
    private Set<Files> files;
}
