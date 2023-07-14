package com.example.Student.Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopId;
    private String laptopName;
    private String laptopBrand;
    private Integer laptopPrice;

    @OneToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;
}
