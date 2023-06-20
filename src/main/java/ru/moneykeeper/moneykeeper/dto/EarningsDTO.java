package ru.moneykeeper.moneykeeper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EarningsDTO extends GenericDTO{
    private Integer amount;
    private Long userId;
}
