package com.BeerRevolution.service_provision.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 150)
    private String nome;

    @Column(nullable = false,length = 11)
    private String cpf;

    @Column(name="data_cadastro")
    @JsonFormat(pattern = "dd/mm/yyyy")
    private LocalDate dataCadastro;
}
