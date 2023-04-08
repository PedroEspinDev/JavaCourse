package com.example.demo.Entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@Entity
@ToString
@Table(name = "person")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
}

