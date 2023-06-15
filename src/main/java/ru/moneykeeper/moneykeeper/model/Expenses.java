package ru.moneykeeper.moneykeeper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "expenses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "expenses_seq", allocationSize = 1)
public class Expenses extends GenericModel{
    @Column(name = "expanses_name", nullable = false)
    private String expansesName;
    @ManyToOne
    @JoinColumn(name = "users_id", foreignKey = @ForeignKey(name = "FK_EXPANSES_USER"))
    private Users users;
}
