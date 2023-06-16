package ru.moneykeeper.moneykeeper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "earnings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_gen", sequenceName = "earnings_seq", allocationSize = 1)
public class Earnings extends GenericModel{
    @Column(name = "amount", nullable = false)
    private Integer amount;
    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_AMOUNT_USER"))
    private Users users;
}
