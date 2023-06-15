package ru.moneykeeper.moneykeeper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "files")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_seq", sequenceName = "files_seq", allocationSize = 1)
public class Files extends GenericModel{
    @Column(name = "files")
    private String files;
    @ManyToOne
    @JoinColumn(name = "users_id", foreignKey = @ForeignKey(name = "FK_FILES_USERS"))
    private Users users;
}
