package com.example.Student.Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long studentId;
    private String studentName;
    private Integer studentAge;
    private  String studentPhoneNo;
    private String studentBranch;



    @OneToOne
    @JoinColumn(name = "fk_add_id")
    private Address address;
}
