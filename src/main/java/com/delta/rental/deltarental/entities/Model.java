package com.delta.rental.deltarental.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    private List<Car> cars;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

}
