package com.BeerRevolution.service_provision.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 255)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_Cliente") //nome da chave estrangeira
    private Cliente cliente;

    private BigDecimal valor;


}
