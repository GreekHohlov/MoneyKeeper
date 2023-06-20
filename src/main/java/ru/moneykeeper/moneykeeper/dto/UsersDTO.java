package ru.moneykeeper.moneykeeper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class UsersDTO extends GenericDTO{
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String login;
    private String phone;
    private String password;
    private String changePasswordToken;
    private Set<Long> expansesIds;
    private Set<Long> filesIds;
    private Set<Long> earningsIds;
    private LocalDateTime deletedWhen;
    private boolean isDeleted;
}
