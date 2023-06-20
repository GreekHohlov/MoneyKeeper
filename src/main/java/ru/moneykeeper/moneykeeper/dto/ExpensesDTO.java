package ru.moneykeeper.moneykeeper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExpensesDTO extends GenericDTO{
    private String expansesName;
    private Long userId;
}
