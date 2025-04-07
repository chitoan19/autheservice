package com.toannc.authservice.model;

import lombok.Data;

@Data
public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(unique = true, nullable = false)
    private String name;
}
