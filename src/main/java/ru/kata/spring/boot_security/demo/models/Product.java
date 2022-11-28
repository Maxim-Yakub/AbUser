package ru.kata.spring.boot_security.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 15)
    String number;

    @Column(length = 30)
    String location;

    @Column(length = 30)
    String stage;

    @Column(length = 30)
    String note;

    @Column(length = 30)
    String literal;

    @Column(length = 30)
    String type;

    @Column
    Date contractDate;

    @Column
    Date factDate;

    @OneToMany(mappedBy = "product")
    private Collection<Subject> subjects = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "contract_id")
    Contract contract;
}
