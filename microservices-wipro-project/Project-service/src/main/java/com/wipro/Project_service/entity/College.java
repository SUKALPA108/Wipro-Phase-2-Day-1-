package com.wipro.Project_service.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data // Generates getters, setters, toString, equals, and hashCode
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Department> departments;
}
