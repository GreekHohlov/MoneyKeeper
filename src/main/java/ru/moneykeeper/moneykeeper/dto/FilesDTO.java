package ru.moneykeeper.moneykeeper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FilesDTO extends GenericDTO{
    private String files;
    private Long userId;
}
